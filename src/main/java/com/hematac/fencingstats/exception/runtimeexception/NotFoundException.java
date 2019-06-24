package com.hematac.fencingstats.exception.runtimeexception;

public class NotFoundException extends RuntimeException {

    private String message;

    public NotFoundException(String message) {
        this.message = message;
    }

    public String getExceptionMessage() {
        return message;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.message = exceptionMessage;
    }
}
