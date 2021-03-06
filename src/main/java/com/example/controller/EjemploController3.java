package com.example.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
		
		private static final Log LOGGER=LogFactory.getLog(EjemploController3.class);
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
			LOGGER.info("INFO TRACE");
			LOGGER.info("WARNING TRACE");
			LOGGER.info("ERROR TRACE");
			LOGGER.info("DEBUG TRACE");
			model.addAttribute("persona", new Person());
//			//provocaremos un error en tiempo de ejecucion para que salte el error 500
//			int i=6/0;
			return FORM_VIEW;
		}
		
		@PostMapping("/addPerson")
		public ModelAndView addPerson(@Validated @ModelAttribute("persona") Person persona, BindingResult bindingResult) {
			ModelAndView mav=new ModelAndView(RESULT_VIEW);
			if(bindingResult.hasErrors()) {
				mav.setViewName(FORM_VIEW);
			}else {
				mav.setViewName(RESULT_VIEW);
				mav.addObject("persona",persona);
				LOGGER.info("METHOD: 'addPerson' -- PARAMS: '"+persona +"'");
				LOGGER.info("TEMPLATE: '"+RESULT_VIEW+"' -- DATA: '"+persona+"'");
			}
			return mav;
		}
	
	
}
