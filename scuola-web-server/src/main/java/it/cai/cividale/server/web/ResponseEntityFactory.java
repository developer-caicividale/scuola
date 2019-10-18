package it.cai.cividale.server.web;

import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityFactory {
    public static <T> ResponseEntity<T> create(final HttpStatus status, final T body) {
	return ResponseEntity.status(status).cacheControl(CacheControl.noStore()).body(body);
    }
}
