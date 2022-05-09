package com.desafio.payment.services.impl;

import com.desafio.payment.controller.response.PaymentFetchResponse;
import com.desafio.payment.models.Exchange;
import com.desafio.payment.models.Payment;
import com.desafio.payment.services.PaymentOperations;
import com.desafio.payment.mappers.PaymentMapper;
import com.desafio.payment.repositories.PaymentRepository;
import com.desafio.payment.repositories.entities.PaymentEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PaymentOperationsService implements PaymentOperations {

    private final PaymentRepository paymentRepository;

    private final PaymentMapper mapper;

    private final CashExchangeService cashExchangeService;

    @Override
    public Exchange processPayerChange(final Payment payment) {
        PaymentEntity paymentEntity = mapper.toPaymentEntity(payment);

        final var exchangeOptions = cashExchangeService
            .getCashExchangeOptions(paymentEntity.getExchangeValue());

        paymentRepository.save(paymentEntity);

        return mapper.toExchange(payment, exchangeOptions);
    }

    @Override
    public List<PaymentFetchResponse> getPaymentsList(final Integer paymentId) {
        return paymentRepository.findByPayerId(paymentId).stream()
                .map(mapper::fromEntitytoPaymentResponse2)
                .collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
                    if (e.isEmpty()) throw new ResourceNotFoundException();
                    return e;
                }));
    }
}
