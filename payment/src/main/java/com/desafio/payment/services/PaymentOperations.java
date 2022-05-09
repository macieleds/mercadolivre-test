package com.desafio.payment.services;

import com.desafio.payment.controller.response.PaymentFetchResponse;
import com.desafio.payment.models.Exchange;
import com.desafio.payment.models.Payment;

import java.util.List;

public interface PaymentOperations {

    Exchange processPayerChange(Payment payment);

    List<PaymentFetchResponse> getPaymentsList(Integer paymentId);

}
