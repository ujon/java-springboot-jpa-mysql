package com.ujon.jsjm.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EntityNotFoundException extends RuntimeException {
    private String msg;

    public EntityNotFoundException() {
        this.msg = "Entity Not Found";
    }

    @Override
    public String getMessage() {
        return "<Entity Not Found>" + this.msg;
    }
}
