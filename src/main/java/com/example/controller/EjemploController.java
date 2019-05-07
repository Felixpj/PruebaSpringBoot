package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.component.EjemploComponent;
import com.example.model.Person;
import com.example.servicios.EjemploServicio;

@Controller
@RequestMapping("/ejemplo")
public class EjemploController {
	
	public static final String EXAMPLE_VIEW="ejemplo";
	
	@Autowired
	@Qualifier("ejemploServicio")
	private EjemploServicio ejemploServicio;
	
	@Autowired
	@Qualifier("ejemploComponent")
	private EjemploComponent ejemploComponent;
	
	//forma1
	@GetMapping("/helloWorld")
	public String helloWorld(Model model){
		ejemploComponent.sayHello();
		model.addAttribute("personas",ejemploServicio.getPersonas());
		return EXAMPLE_VIEW;
	}
	
	//forma2
	@GetMapping("/helloWorldMAV")
	public ModelAndView helloWorldMAV() {
		ModelAndView mav=new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("personas", ejemploServicio.getPersonas());
		return mav;
	}


	

	
}
