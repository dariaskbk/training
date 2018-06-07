package com.ariasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/inicio")
public class InicioController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String inicio() {
		return "inicio";
	}
}
