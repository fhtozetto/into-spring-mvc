package br.com.lph.curso.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET) // marca qual será o path que chamara essa página
	public String welcome() {
		return "welcome"; // nome da página sem a extenção
	}

	@RequestMapping(value = "/teste", method = RequestMethod.GET) // marca qual será o path que chamara essa página
	public ModelAndView teste() {
		ModelAndView view = new ModelAndView("welcome");
		view.addObject("teste", "Olá eu sou o Spring MVC.");
		return view;
	}
}
