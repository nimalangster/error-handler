package com.demo.errorhandler.customizedexceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomizedException2 extends RuntimeException{
	
	public CustomizedException2(Integer id, String reason) {
		
		super("This is customized exception no 2 with id "+ id +" and with reason " + reason + " !");
	}
}
