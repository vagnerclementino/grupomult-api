package br.com.grupomult.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public final class HttpInternalErrorException extends RuntimeException {

	private static final long serialVersionUID = -8500278227911456367L;

	public HttpInternalErrorException(String message) {
		super(message);
	}

}
