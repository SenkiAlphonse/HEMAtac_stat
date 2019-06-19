package com.hematac.fencingstats.controller.controlleradvice;

import com.hematac.fencingstats.customexception.runtimeexception.InternalServerErrorEx;
import com.hematac.fencingstats.dto.errorresponse.ErrorResponseDto;
import com.hematac.fencingstats.dto.errorresponse.ValidationErrorDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class EsceptionRestControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InternalServerErrorEx.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    ErrorResponseDto internalServerErrorHandler(
            HttpServletRequest page, InternalServerErrorEx exception) {
        return getErrorResponseDto(
                exception.getExceptionMessage(), page, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ErrorResponseDto getErrorResponseDto(
            String exceptionMessage, HttpServletRequest page, HttpStatus httpStatus) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
        errorResponseDto.path = page.getRequestURI();
        errorResponseDto.message = exceptionMessage;
        errorResponseDto.status = httpStatus;
        errorResponseDto.timeStamp = LocalDate.now();
        return errorResponseDto;
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException exception,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest webRequest) {
        ValidationErrorDto validationErrorDto = getDtoFromExceptionErrors(exception.getBindingResult());

        return super.handleExceptionInternal(
                exception, validationErrorDto, headers, status, webRequest);
    }

    private ValidationErrorDto getDtoFromExceptionErrors(Errors errors) {
        ValidationErrorDto validationErrorDto = new ValidationErrorDto();
        List<String> errorsFound = new ArrayList<>();

        for (ObjectError objectError : errors.getAllErrors()) {
            errorsFound.add(objectError.getDefaultMessage());
        }
        validationErrorDto.message = errorsFound;
        return validationErrorDto;
    }

}
