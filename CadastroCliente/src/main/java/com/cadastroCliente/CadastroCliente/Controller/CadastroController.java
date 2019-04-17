package com.cadastroCliente.CadastroCliente.Controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cadastroCliente.CadastroCliente.Models.Local;

@Controller
public class CadastroController {
	@RequestMapping(value = "/cadastroclientes", method=RequestMethod.POST)
	public ModelAndView exibir(Local local) {
		
		ModelAndView viewRetorno = new ModelAndView("cadastroclientes");
		viewRetorno.addObject("local", local);
		
		return viewRetorno;
		
	}
	
}
