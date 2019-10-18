package it.cai.cividale.server.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResponseEntityRestControllerAdvice {
    @ExceptionHandler({ Throwable.class })
    public ResponseEntity<String> handleException(Throwable t) {
	return ResponseEntityFactory.create(HttpStatus.INTERNAL_SERVER_ERROR, t.getMessage());
    }
}
