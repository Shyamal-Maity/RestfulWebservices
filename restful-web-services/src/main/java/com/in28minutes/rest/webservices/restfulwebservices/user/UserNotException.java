package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotException extends RuntimeException {

	public UserNotException(String message) {
		super(message);
	}
	
}
