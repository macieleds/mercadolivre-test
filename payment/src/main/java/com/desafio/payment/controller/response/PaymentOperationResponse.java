package com.desafio.payment.controller.response;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
public class PaymentOperationResponse {

    private Integer paymentId;

    private Integer productsValue;

    private Integer totalReceived;

    private ExchangeDTO exchange;

    @Data
    @AllArgsConstructor
    public static class ExchangeDTO {
        private Integer exchangeValue;
        List<OptionDTO> options;
    }

    @Data
    @AllArgsConstructor
    public static class OptionDTO {
        private Integer coinQuantity;
        private String combination;
    }

}
