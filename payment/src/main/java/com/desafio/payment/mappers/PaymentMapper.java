package com.desafio.payment.mappers;

import com.desafio.payment.controller.request.PaymentRequest;
import com.desafio.payment.controller.response.PaymentFetchResponse;
import com.desafio.payment.controller.response.PaymentOperationResponse;
import com.desafio.payment.models.Exchange;
import com.desafio.payment.models.Mix;
import com.desafio.payment.models.Payment;
import com.desafio.payment.repositories.entities.PaymentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",
    uses = { ExchangeMapper.class, OptionMapper.class }
)
public interface PaymentMapper {

    PaymentEntity toPaymentEntity(Payment payment);

    PaymentOperationResponse fromEntitytoPaymentResponse(PaymentEntity paymentEntity);

    PaymentFetchResponse fromEntitytoPaymentResponse2(PaymentEntity paymentEntity);

    @Mapping(target = "paymentId", source = "request.paymentId")
    @Mapping(target = "payerId", source = "payer")
    @Mapping(target = "productsValue", source = "request.productsValue")
    @Mapping(target = "totalReceived", source = "request.totalReceived")
    Payment toPayment(PaymentRequest request, Integer payer);

    @Mapping(target = "options", source = "exchangeOptions")
    Exchange toExchange(Payment payment, List<Mix> exchangeOptions);

    @Mapping(target = "paymentId", source = "payment.paymentId")
    @Mapping(target = "productsValue", source = "payment.productsValue")
    @Mapping(target = "totalReceived", source = "payment.totalReceived")
    PaymentOperationResponse toPaymentResponse(Payment payment, Exchange exchange);

}
