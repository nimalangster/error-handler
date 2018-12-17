package com.demo.errorhandler.customizedexceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class CustomizedException1 extends RuntimeException {
	
	public CustomizedException1(Integer id, String reason) {
		
	super("This is customized exceptions no 1 with id " + id + " and with reason " + reason +" !");
	
	}
}
