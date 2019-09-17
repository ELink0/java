package com.comapp.loja.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.comapp.loja.modelos.Estado;

public interface EstadoRepositorio extends JpaRepository<Estado, Long> {
	List<Estado> findByNome(String nome);
	
	@Query("select e from Estado e where e.nome like %?1%")
	List<Estado> buscarPorNome(String nome);
}
