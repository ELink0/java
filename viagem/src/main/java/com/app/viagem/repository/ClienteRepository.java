package com.app.viagem.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.viagem.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
