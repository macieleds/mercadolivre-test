package com.desafio.payment.models;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Payment {

    Integer paymentId;
    Integer payerId;
    Integer productsValue;
    Integer totalReceived;

    public Integer getExchangeValue() {
        return this.totalReceived - this.productsValue;
    }
}
