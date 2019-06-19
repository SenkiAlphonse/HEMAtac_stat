package com.hematac.fencingstats.customexception.runtimeexception;

public class InternalServerErrorEx extends RuntimeException {

    private String message;

    public InternalServerErrorEx(String message) {
        this.message = message;
    }

    public String getExceptionMessage() {
        return message;
    }

    public void setExceptionMessage(String messageErrorResponse) {
        this.message = messageErrorResponse;
    }
}
