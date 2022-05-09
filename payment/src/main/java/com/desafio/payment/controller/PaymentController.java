package com.desafio.payment.controller;

import com.desafio.payment.controller.request.PaymentRequest;
import com.desafio.payment.controller.response.PaymentOperationResponse;
import com.desafio.payment.controller.response.PaymentFetchResponse;
import com.desafio.payment.controller.response.ResponseWrapper;
import com.desafio.payment.mappers.PaymentMapper;
import com.desafio.payment.services.PaymentOperations;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@Validated
@RestController
@RequestMapping("/payers")
public class PaymentController {

    private final PaymentOperations paymentOperations;

    private final PaymentMapper mapper;

    @GetMapping("/{payerId}/payments")
    public ResponseWrapper<List<PaymentOperationResponse>> findPayerPayments(
        @PathVariable final Integer payerId
    ) {
       List<PaymentFetchResponse> payments = paymentOperations.getPaymentsList(payerId);
       return new ResponseWrapper(payments);
    }

    @PostMapping("/{payerId}/payments")
    public ResponseEntity<PaymentOperationResponse> createPayerChange(
        @PathVariable final Integer payerId,
        @Valid @RequestBody final PaymentRequest paymentRequest
    ) {
        final var payment = mapper.toPayment(paymentRequest, payerId);
        final var exchange = paymentOperations.processPayerChange(payment);
        final PaymentOperationResponse response = mapper.toPaymentResponse(payment, exchange);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
