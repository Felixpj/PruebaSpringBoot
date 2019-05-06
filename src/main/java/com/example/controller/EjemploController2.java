package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ejemplo2")
public class EjemploController2 {

	private static final String EXAMPLE2_VIEW="ejemplo2";
	
	//localhost:8090/ejemplo2/request1?nm=Pepe
	//localhost:8090/ejemplo2/request1?nm=Juan
	@GetMapping("/request1")
public ModelAndView request1(@RequestParam(name="nm" , required = false, defaultValue = "NULL") String nombre) {
	ModelAndView mav=new ModelAndView(EXAMPLE2_VIEW); 
	mav.addObject("nm_in_model",nombre);
	return mav;
}
	
	
	
}
