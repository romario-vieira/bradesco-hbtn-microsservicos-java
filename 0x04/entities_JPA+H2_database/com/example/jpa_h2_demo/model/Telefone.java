package com.example.jpa_h2_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Telefone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long ddd;
	
	private Long numero;

	public Telefone(Long ddd, Long numero, Cliente cliente) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.cliente = cliente;
	}

	public Long getDdd() {
		return ddd;
	}

	public void setDdd(Long ddd) {
		this.ddd = ddd;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
}
