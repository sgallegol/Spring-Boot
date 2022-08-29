package com.pruebanttdata.samir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//prueba restablecimiento

@Controller
public class ControllerHome {
	//http://localhost:80880
	@GetMapping(value= "/")
	public String home() {
		return "home";
	}

}
