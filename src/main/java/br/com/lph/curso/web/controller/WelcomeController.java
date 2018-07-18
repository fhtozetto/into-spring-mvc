package br.com.lph.curso.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller // Anotação responsável por informar ao Spring MVC que está é uma classe (bean) do tipo controller;
public class WelcomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET) // Esta anotação tem como função mapear o path de acesso, via URL, ao método. Outro objetivo é definir o verbo HTTP (POST, GET, ...) referente à solicitação
	public String welcome() {
		return "welcome"; // nome da página sem a extenção
	}

	@RequestMapping(value = "/teste", method = RequestMethod.GET) // Esta anotação tem como função mapear o path de acesso, via URL, ao método. Outro objetivo é definir o verbo HTTP (POST, GET, ...) referente à solicitação
	public ModelAndView teste() { //O objeto ModelAndView é usado como recurso do Spring MVC para enviar valores para as páginas através de variáveis
		ModelAndView view = new ModelAndView("welcome");
		view.addObject("teste", "Olá eu sou o Spring MVC.");
		return view;
	}
}
