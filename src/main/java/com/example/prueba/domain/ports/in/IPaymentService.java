package com.example.prueba.domain.ports.in;

import com.example.prueba.application.dtos.requests.CreatePaymentRequest;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;

public interface IPaymentService {
    Payment create(CreatePaymentRequest request, String cancelUrl, String successUrl) throws PayPalRESTException;
}
