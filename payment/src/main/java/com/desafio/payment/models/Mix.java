package com.desafio.payment.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Mix {
    int[] coinSet;

    @EqualsAndHashCode.Include
    List<CoinChange> change = new ArrayList<>();

    Integer coins = 0;

    public void addChange(int coin, int qty) {
        if (qty <= 0) return;
        change.add(new CoinChange(coin, qty));
        coins += qty;
    }

    @Override
    public String toString() {
        return "Coins: [" + coins + "], Change: " + change.toString();
    }
}
