package com.desafio.payment.services.impl;

import com.desafio.payment.models.Mix;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@Service
public class CashExchangeService {

    private static final int[][] mixes = {
        { 8, 5, 3, 2, 1 },
        { 8, 5, 3, 1 },
        { 8, 5, 2, 1 },
        { 8, 3, 2, 1 },
        { 5, 3, 2, 1 },
        { 8, 5, 1 },
        { 8, 3, 1 },
        { 8, 2, 1 },
        { 5, 3, 1 },
        { 5, 2, 1 },
        { 3, 2, 1 },
        { 8, 1 },
        { 5, 1 },
        { 3, 1 },
        { 2, 1 }
    };

    public List<Mix> getCashExchangeOptions(final Integer exchangeValue) {
        return Stream.of(mixes)
            .map(it ->this.getCashExchange(it, exchangeValue))
            .distinct()
            .sorted(Comparator.comparingInt(Mix::getCoins))
            .limit(3)
            .toList();
    }

    public Mix getCashExchange(@NonNull final int[] coins,
                               @NonNull final Integer exchangeValue) {
        Integer remains = exchangeValue;
        final Mix result = new Mix();

        for (int coin : coins) {
            if (coin > remains) continue;
            result.addChange(coin, Math.floorDiv(remains, coin));
            remains = remains % coin;

            if (remains <= 0) break;
        }
        return result;
    }

}
