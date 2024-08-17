package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PetController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openFirstPage() {			 
		
		return "index";		
		
	}
	
	@RequestMapping(value = "cats",method = RequestMethod.GET)
	public String openCatsPage() {			 
		
		return "cats";		
		
	}
	
	@RequestMapping(value = "dogs",method = RequestMethod.GET)
	public String openDogsPage() {			 
		
		return "dogs";		
		
	}
	
}
