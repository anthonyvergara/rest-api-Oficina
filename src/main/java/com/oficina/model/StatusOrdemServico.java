package com.oficina.model;

import java.io.Serializable;
import java.sql.Date;

import com.oficina.modelEnum.StatusPagamento;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StatusOrdemServico implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	private Date ultimoPagamento;
	
	private StatusPagamento statusPagamento; // procurar sobre enum para entender funcionamento por completo
	
	private double saldoDevedor;
	
	
		
}
