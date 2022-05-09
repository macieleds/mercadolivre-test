package com.desafio.payment.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CoinChange {
    @EqualsAndHashCode.Include
    int coin;

    @EqualsAndHashCode.Include
    int qty;

    @Override
    public String toString() {
        return "Change: [" + coin + ", " + qty + "]";
    }
}
