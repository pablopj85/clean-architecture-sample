package org.pablopj.cleanarchsample.infrastructure.handler;

import org.pablopj.cleanarchsample.domain.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;

@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(NotFoundException.class)
	public final ResponseEntity<Object> handleNotFoundException(NotFoundException ex, WebRequest request) {
		return new ResponseEntity<>(new ResponseError(ex.getMessage()), HttpStatus.NOT_FOUND);
	}

	@Data
	@AllArgsConstructor
	class ResponseError {
		
		private String message;
		
	}
	
}
