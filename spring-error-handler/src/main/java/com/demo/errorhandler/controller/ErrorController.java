package com.demo.errorhandler.controller;

import org.apache.tomcat.util.bcel.classfile.ClassFormatException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.errorhandler.customizedexceptions.CustomizedException1;
import com.demo.errorhandler.customizedexceptions.CustomizedException2;

@RestController
public class ErrorController {
	
	@GetMapping("/error1")
	public void getDetails1() {
		
		Integer id = 12342;
		String reason = "CUSTOMIZED ERROR NUMBER 1";		
		
		throw new CustomizedException1(id, reason);
		
	}
	
	@GetMapping("/error2")
	public void getDetails2() {
		
		Integer id = 22342;
		String reason = "CUSTOMIZED ERROR NUMBER 2";		
		
		throw new CustomizedException2(id, reason);
		
	}

}
