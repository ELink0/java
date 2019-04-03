
package com.example.gestaoEscolar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GestaoEscolarControler {
	@RequestMapping(value ="/analisar", method = RequestMethod.POST)
	public ModelAndView somar(String nome, String curso) {
		ModelAndView mv = new ModelAndView("index");
		if(curso.equals("tecinfo")) {
			mv.addObject("nomeAluno", nome);
			mv.addObject("resultado", "22");
		}
		
		return mv;
	}
}
