package com.hematac.fencingstats.exception.runtimeexception;

public class InternalServerErrorException extends RuntimeException {

    private String message;

    public InternalServerErrorException(String message) {
        this.message = message;
    }

    public String getExceptionMessage() {
        return message;
    }

    public void setExceptionMessage(String messageErrorResponse) {
        this.message = messageErrorResponse;
    }
}
