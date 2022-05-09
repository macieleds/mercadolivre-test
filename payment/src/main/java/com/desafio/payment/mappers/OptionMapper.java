package com.desafio.payment.mappers;

import com.desafio.payment.controller.response.PaymentOperationResponse;
import com.desafio.payment.models.CoinChange;
import com.desafio.payment.models.Mix;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface OptionMapper {

    @Mapping(target = "coinQuantity", source = "coins")
    @Mapping(target = "combination", source = "change", qualifiedByName = "coinsToCombination")
    PaymentOperationResponse.OptionDTO toDto(Mix options);

    List<PaymentOperationResponse.OptionDTO> toDto(Set<Mix> options);

    @Named("coinsToCombination")
    default String coinsToCombination(List<CoinChange> coins) {
        final var result = new StringBuilder();
        for (var coin: coins) {
            result.append(String.valueOf(coin.getCoin() + ", ").repeat(coin.getQty()));
        }
        return result.deleteCharAt(result.length()-2).toString();
    }

}
