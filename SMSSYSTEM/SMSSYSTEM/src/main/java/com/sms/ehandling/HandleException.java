package com.sms.ehandling;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class HandleException extends ResponseEntityExceptionHandler{
	
  	 //Internal server Exception
	  @ExceptionHandler(InternalServerErr.class)	
	  public ResponseEntity<Object> handleNotFoundException(InternalServerErr ex, WebRequest res){
		  Response obj = new Response();
		  obj.setMessage(ex.getMessage());
		  obj.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		  obj.setDateTime(LocalDateTime.now());
		  
		 return new ResponseEntity<Object>(obj,HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	  
	  //Not found exception
	  @ExceptionHandler(UserNotFound.class)	
	  public ResponseEntity<Object> NotFound(UserNotFound ex, WebRequest res){
		  Response obj = new Response();
		  obj.setMessage(ex.getMessage());
		  obj.setStatus(HttpStatus.NOT_FOUND);
		  obj.setDateTime(LocalDateTime.now());
		  
		 return new ResponseEntity<Object>(obj,HttpStatus.NOT_FOUND);
	  }
}
