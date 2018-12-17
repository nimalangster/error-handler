package com.demo.errorhandler.exceptionhandler;

import org.apache.tomcat.util.bcel.classfile.ClassFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.demo.errorhandler.customizedexceptions.CustomizedException1;
import com.demo.errorhandler.customizedexceptions.CustomizedException2;
import com.demo.errorhandler.entity.ErrorResponse;

@ControllerAdvice
public class ExceptionHandler {
	
	@Autowired
	ErrorResponse er;
	
	@org.springframework.web.bind.annotation.ExceptionHandler(CustomizedException1.class)
	public ResponseEntity<ErrorResponse> getErrorResponse(CustomizedException1 ex){
		
		er.setErrorCode(ex.hashCode());
		er.setErrorMessage(" This is redirected to view 1 !" + ex.getMessage());
		
		return new ResponseEntity<ErrorResponse>(er, HttpStatus.EXPECTATION_FAILED);	
		
	}

	
	@org.springframework.web.bind.annotation.ExceptionHandler(CustomizedException2.class)
	public ResponseEntity<ErrorResponse> getClassErrorResponse(CustomizedException2 ex){
		
		er.setErrorCode(ex.hashCode());
		er.setErrorMessage(" This is redirected to view 2 " + ex.getMessage());
		
		return new ResponseEntity<ErrorResponse>(er, HttpStatus.EXPECTATION_FAILED);	
		
	}
	
	
}
