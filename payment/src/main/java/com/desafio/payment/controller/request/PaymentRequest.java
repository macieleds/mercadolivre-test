package com.desafio.payment.controller.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
public class PaymentRequest {

    @NotNull(message = "Products value are required.")
    @Positive(message = "Not a valid value.")
    private Integer productsValue;

    @NotNull(message = "Total received is required.")
    @Positive(message = "Not a valid value.")
    private Integer totalReceived;

}
