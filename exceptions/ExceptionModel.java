package com.pruebanttdata.samir.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExceptionModel extends RuntimeException {

	public ExceptionModel(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	

	
}
