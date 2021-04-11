package com.ujon.jsjm.exception;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class BadRequestException extends RuntimeException {
    private String msg;

    public BadRequestException() {
        this.msg = "BAD REQUEST";
    }

    @Override
    public String getMessage() {
        return "<Bad Request>" + this.msg;
    }
}
