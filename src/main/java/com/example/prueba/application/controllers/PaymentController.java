package com.example.prueba.application.controllers;

import com.example.prueba.application.dtos.requests.CreatePaymentRequest;
import com.example.prueba.domain.ports.in.IPaymentService;
import com.example.prueba.infraestructure.util.URLUtils;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private IPaymentService service;

    public static final String PAYPAL_SUCCESS_URL = "/pay/success";
    public static final String PAYPAL_CANCEL_URL = "/pay/cancel";

    private Logger log = LoggerFactory.getLogger(getClass());

    @PostMapping("/pay")
    public ResponseEntity<String> pay(@RequestBody CreatePaymentRequest request, HttpServletRequest httpRequest) {
        String baseUrl = httpRequest.getRequestURL().toString()
                .replace(httpRequest.getRequestURI(), httpRequest.getContextPath());
        String cancelUrl = baseUrl + PAYPAL_CANCEL_URL;
        String successUrl = baseUrl + PAYPAL_SUCCESS_URL;
        try {
            Payment payment = service.create(request, cancelUrl, successUrl);
            for (Links links : payment.getLinks()) {
                if (links.getRel().equalsIgnoreCase("approval_url")) {
                    return ResponseEntity.ok(links.getHref());
                }
            }
        } catch (PayPalRESTException e) {
            log.error("Error en la creación del pago: ", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el pago.");
        }
        return ResponseEntity.badRequest().body("No se pudo redirigir a la URL de aprobación de PayPal.");
    }
}
