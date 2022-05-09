package com.desafio.payment.controller.exceptions;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ValidationError extends StandardError{
    private static final long serialVersionUID = 1L;

    private final List<FieldMessage> errors = new ArrayList<>();

    public void addError(final String fieldName, final String message) {
        errors.add(new FieldMessage(fieldName, message));
    }
}
