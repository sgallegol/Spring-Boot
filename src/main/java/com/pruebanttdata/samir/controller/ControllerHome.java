package com.pruebanttdata.samir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerHome {
	
	@GetMapping(value="/")
	public String home() {
		return "index";
	}
	public void deleteme() {
		
	}
	

}
