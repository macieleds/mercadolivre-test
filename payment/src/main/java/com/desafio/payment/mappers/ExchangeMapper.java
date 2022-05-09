package com.desafio.payment.mappers;

import com.desafio.payment.controller.response.PaymentOperationResponse;
import com.desafio.payment.models.Exchange;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",
    uses = { OptionMapper.class })
public interface ExchangeMapper {

    @Mapping(target = "exchangeValue", source = "exchangeValue")
    @Mapping(target = "options", source = "options")
    PaymentOperationResponse.ExchangeDTO toDto(Exchange exchange);

}
