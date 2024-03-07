package com.example.prueba.application.dtos.requests;

import com.example.prueba.paypal.PaypalPaymentIntent;
import com.example.prueba.paypal.PaypalPaymentMethod;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreatePaymentRequest {
    private String currency;
    private Double total;
    private String description;
    private PaypalPaymentMethod method;
    private PaypalPaymentIntent intent;
    private String email;
    private String userId;
}
