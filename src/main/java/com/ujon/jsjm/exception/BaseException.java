package com.ujon.jsjm.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class BaseException {

    @ExceptionHandler({BadRequestException.class, EntityNotFoundException.class})
    public ResponseEntity<Object> handleBadRequestException(final RuntimeException ex) {
        log.error("400: " + ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({RuntimeException.class, Exception.class})
    public ResponseEntity<Object> handleException(final Exception ex) {
        log.error("500: " + ex.getMessage());
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
