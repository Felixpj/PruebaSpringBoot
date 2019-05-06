package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Person;

@Controller
@RequestMapping("/ejemplo")
public class HelloWorldController {
	
	public static final String EXAMPLE_VIEW="ejemplo";
	
	//forma1
	@GetMapping("/helloWorld")
	public String helloWorld(Model model){
		model.addAttribute("personas",getPersonas());
		return EXAMPLE_VIEW;
	}
	
	//forma2
	@GetMapping("/helloWorldMAV")
	public ModelAndView helloWorldMAV() {
		ModelAndView mav=new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("personas", getPersonas());
		return mav;
	}

	private List<Person> getPersonas(){
		List<Person> personas=new ArrayList<>();
		personas.add(new Person("Félix", 33));
		personas.add(new Person("Juan", 23));
		personas.add(new Person("Jorge", 43));
		personas.add(new Person("Arzuan", 13));
		return personas;
	}
	

	
}
