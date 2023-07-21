package com.recruitment.controller;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApplicationController {

	
	
	
	public String retreiveInfo( ) {
		
		return null;
		
	}
	
	public String fallback(Exception e) {
		return "Sorry Service is unavailable";
	}
	
}
