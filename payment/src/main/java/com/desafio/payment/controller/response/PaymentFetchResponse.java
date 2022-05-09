package com.desafio.payment.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PaymentFetchResponse {

    private Integer paymentId;

    private Integer productsValue;

    private Integer totalReceived;

}
