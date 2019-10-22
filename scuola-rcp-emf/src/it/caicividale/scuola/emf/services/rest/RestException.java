package it.caicividale.scuola.emf.services.rest;

public class RestException extends RuntimeException {
	private static final long serialVersionUID = 8145470379746245462L;

	RestException(String message) {
		super(message);
	}

	RestException(Throwable cause) {
		super(cause);
	}
}
