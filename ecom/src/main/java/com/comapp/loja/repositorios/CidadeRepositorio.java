package com.comapp.loja.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.comapp.loja.modelos.Cidade;

public interface CidadeRepositorio extends JpaRepository<Cidade, Long> {
	List<Cidade> findByNome(String nome);
	
	@Query("select e from Cidade e where e.nome like %?1%")
	List<Cidade> buscarPorNome(String nome);
}
