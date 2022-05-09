package com.desafio.payment.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exchange {

    private Payment payment;

    private List<Mix> options;

    public Integer getExchangeValue() {
        return payment.getTotalReceived() - payment.getProductsValue();
    }
}
