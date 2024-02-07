package com.app.exception_handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	 @ExceptionHandler(Exception.class)
	    
	    public ResponseEntity<?> handleGenericException(Exception ex) {
	        // Log the exception here
	        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("An unexpected error occurred");
	    }
}
