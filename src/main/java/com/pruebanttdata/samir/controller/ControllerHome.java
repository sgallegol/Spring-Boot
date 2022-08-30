package com.pruebanttdata.samir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

<<<<<<< HEAD
@Controller
public class ControllerHome {
	
	@GetMapping(value="/")
	public String home() {
		return "index";
	}
	public void deleteme() {
		
	}
	
=======

//prueba restablecimiento

@Controller
public class ControllerHome {
	//http://localhost:80880
	@GetMapping(value= "/")
	public String home() {
		return "home";
	}
>>>>>>> 48b690a86fd4436aa0d4d5c07986cb168423309d

}
