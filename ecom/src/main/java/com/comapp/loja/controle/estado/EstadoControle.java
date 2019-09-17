package com.comapp.loja.controle.estado;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comapp.loja.modelos.Estado;
import com.comapp.loja.repositorios.EstadoRepositorio;

@Controller
public class EstadoControle {
	
	@Autowired
	private EstadoRepositorio repositorio;
	
	@GetMapping("/estados")
	public ModelAndView buscarTodos() {
		
		ModelAndView mv = new ModelAndView("/estados/estadoLista");
		mv.addObject("estados", repositorio.findAll());
		
		return mv;
	}
	
	@GetMapping("/estadosNome")
	public ModelAndView buscarNome(String nome) {
		
		ModelAndView mv = new ModelAndView("/estados/estadoLista");
		mv.addObject("estados", repositorio.buscarPorNome(nome));
		
		return mv;
	}
	
	@GetMapping("/adicionarEstado")
	public ModelAndView add(Estado estado) {
		
		ModelAndView mv = new ModelAndView("/estados/estadoAdicionar");
		mv.addObject("estado", estado);
		
		return mv;
	}
	
	@GetMapping("/editarEstado/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		
		Optional<Estado> estado = repositorio.findById(id);
		Estado e = estado.get();	
		
		return add(e);
	}
	
	@GetMapping("/removerEstado/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		
		Optional<Estado> estado = repositorio.findById(id);
		Estado e = estado.get();
		repositorio.delete(e);	
		
		return buscarTodos();
	}

	@PostMapping("/salvarEstado")
	public ModelAndView save(@Valid Estado estado, BindingResult result) {
		
		if(result.hasErrors()) {
			return add(estado);
		}
		
		repositorio.saveAndFlush(estado);
		
		return buscarTodos();
	}

}
