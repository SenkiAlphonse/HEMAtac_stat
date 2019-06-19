package com.hematac.fencingstats.dto.errorresponse;

import org.springframework.http.HttpStatus;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDate;

public class ErrorResponseDto {

    public HttpStatus status;
    public String message;
    public String path;

    @Temporal(TemporalType.TIMESTAMP)
    public LocalDate timeStamp;
}
