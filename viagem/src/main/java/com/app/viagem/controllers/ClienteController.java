package com.app.viagem.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.viagem.models.Cliente;
import com.app.viagem.repository.ClienteRepository;

@Controller
public class ClienteController {
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping("/cliente")
	public ModelAndView buscarTodos() {
		
		ModelAndView mv = new ModelAndView("/tabelaCliente");
		mv.addObject("clientes", repository.findAll());
		
		return mv;
	}
	
	@GetMapping("/addCliente")
	public ModelAndView add(Cliente cliente) {
		
		ModelAndView mv = new ModelAndView("/cadastrarCliente");
		mv.addObject("cliente", cliente);
		
		return mv;
	}
	
	@GetMapping("/editarCliente/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		
		Optional<Cliente> cliente = repository.findById(id);
		Cliente e = cliente.get();	
		
		return add(e);
	}
	
	@GetMapping("/removerCliente/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		
		Optional<Cliente> cliente = repository.findById(id);
		Cliente e = cliente.get();
		repository.delete(e);	
		
		return buscarTodos();
	}

	@PostMapping("/salvarCliente")
	public ModelAndView save(@Valid Cliente cliente, BindingResult result) {
		
		if(result.hasErrors()) {
			return add(cliente);
		}
		
		repository.saveAndFlush(cliente);
		
		return buscarTodos();
	}
	
}
