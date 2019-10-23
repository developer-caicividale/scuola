package it.cai.cividale.server.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityUtils {
    public static <T> ResponseEntity<T> create(final T body) {
	HttpStatus status = (body != null) ? HttpStatus.OK : HttpStatus.NO_CONTENT;
	return ResponseEntityFactory.create(status, body);
    }
}
