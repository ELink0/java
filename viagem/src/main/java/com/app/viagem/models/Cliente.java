package com.app.viagem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Cliente {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	@NotEmpty(message = "É obrigatório informar seu nome")
	private String nome;
	
	@NotEmpty(message = "O CPF é obrigatório")
	private String cpf;

	@Column(nullable = false, length = 9)
	@NotEmpty(message = "O passaporte é obrigatório")
	private String passaporte;
	
//	@ManyToOne
//	private Estado estado;	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
