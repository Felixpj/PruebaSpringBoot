package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.model.Person;

@Controller
@RequestMapping("/ejemplo3")
public class EjemploController3 {
	
		public static final String FORM_VIEW="form";
		public static final String 	RESULT_VIEW="result";
		
//		//forma1
//		@GetMapping("/")
//		public String redirect() {
//			return "redirect:/ejemplo3/showform";
//		}
		
		//forma2
		@GetMapping("/")
		public RedirectView redirect() {
			return new RedirectView("/ejemplo3/showform");
		}
		
		@GetMapping("/showform")
		public String showForm(Model model) {
			model.addAttribute("persona", new Person());
			return FORM_VIEW;
		}
		
		@PostMapping("/addPerson")
		public ModelAndView addPerson(@ModelAttribute("persona") Person persona) {
			ModelAndView mav=new ModelAndView(RESULT_VIEW);
			mav.addObject("persona", persona);
			return mav;
		}
	
	
}
