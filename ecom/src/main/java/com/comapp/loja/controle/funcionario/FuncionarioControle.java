package com.comapp.loja.controle.funcionario;

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
import com.comapp.loja.modelos.Funcionario;
import com.comapp.loja.repositorios.EstadoRepositorio;
import com.comapp.loja.repositorios.FuncionarioRepositorio;

@Controller
public class FuncionarioControle {
	
	@Autowired
	private FuncionarioRepositorio repositorio;
	
	@GetMapping("/funcionarios")
	public ModelAndView buscarTodos() {
		
		ModelAndView mv = new ModelAndView("/funcionarios/funcionarioLista");
		mv.addObject("funcionarios", repositorio.findAll());
		
		return mv;
	}
	
	@GetMapping("/funcionariosNome")
	public ModelAndView buscarNome(String nome) {
		
		ModelAndView mv = new ModelAndView("/funcionarios/funcionarioLista");
		mv.addObject("funcionarios", repositorio.buscarPorNome(nome));
		
		return mv;
	}
	
	@GetMapping("/adicionarFuncionario")
	public ModelAndView add(Funcionario funcionario) {
		
		ModelAndView mv = new ModelAndView("/funcionarios/funcionarioAdicionar");
		mv.addObject("funcionario", funcionario);
		
		return mv;
	}
	
	@GetMapping("/editarFuncionario/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		
		Optional<Funcionario> funcionario = repositorio.findById(id);
		Funcionario e = funcionario.get();	
		
		return add(e);
	}
	
	@GetMapping("/removerFuncionario/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		
		Optional<Funcionario> funcionario = repositorio.findById(id);
		Funcionario e = funcionario.get();
		repositorio.delete(e);	
		
		return buscarTodos();
	}

	@PostMapping("/salvarFuncionario")
	public ModelAndView save(@Valid Funcionario funcionario, BindingResult result) {
		
		if(result.hasErrors()) {
			return add(funcionario);
		}
		
		repositorio.saveAndFlush(funcionario);
		
		return buscarTodos();
	}

}
