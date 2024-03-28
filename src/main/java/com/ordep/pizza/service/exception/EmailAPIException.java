package com.ordep.pizza.service.exception;

public class EmailAPIException extends RuntimeException {
    public EmailAPIException() {
        super("Error sending email");
    }
}
