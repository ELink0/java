package com.comapp.loja.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.comapp.loja.modelos.Estado;
import com.comapp.loja.modelos.Funcionario;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long>{
	List<Funcionario> findByNome(String nome);
	
	@Query("select e from Funcionario e where e.nome like %?1%")
	List<Estado> buscarPorNome(String nome);
}
