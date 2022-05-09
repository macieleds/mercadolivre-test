package com.desafio.payment.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(final String msg) {
        super(msg);
    }
}
