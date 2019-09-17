package com.comapp.loja.controle.estado;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comapp.loja.modelos.Cidade;
import com.comapp.loja.modelos.Estado;
import com.comapp.loja.repositorios.CidadeRepositorio;
import com.comapp.loja.repositorios.EstadoRepositorio;

@Controller
public class CidadeControle {
	
	@Autowired
	private CidadeRepositorio repository;
	
	@Autowired
	private EstadoRepositorio repositoryEstado;
	
	@GetMapping("/cidades")
	public ModelAndView buscarTodos() {
		
		ModelAndView mv = new ModelAndView("/cidades/cidadeLista");
		mv.addObject("cidades", repository.findAll());
				
		
		return mv;
	}
	
	@GetMapping("/adicionarCidade")
	public ModelAndView add(Cidade cidade) {
		
		ModelAndView mv = new ModelAndView("/cidades/cidadeAdicionar");
		mv.addObject("cidade", cidade);
		
		List<Estado> listaEstado = repositoryEstado.findAll();
		mv.addObject("estados",listaEstado);
		
		return mv;
	}
	
	@GetMapping("/editarCidade/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		
		Optional<Cidade> cidade = repository.findById(id);
		Cidade e = cidade.get();	
		
		return add(e);
	}
	
	@GetMapping("/removerCidade/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		
		Optional<Cidade> cidade = repository.findById(id);
		Cidade e = cidade.get();
		repository.delete(e);	
		
		return buscarTodos();
	}

	@PostMapping("/salvarCidade")
	public ModelAndView save(@Valid Cidade cidade, BindingResult result) {
		
		if(result.hasErrors()) {
			return add(cidade);
		}
		
		repository.saveAndFlush(cidade);
		
		return buscarTodos();
	}
}
