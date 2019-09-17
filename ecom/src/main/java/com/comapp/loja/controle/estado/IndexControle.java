package com.comapp.loja.controle.estado;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping()
public class IndexControle {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
