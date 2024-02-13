package com.oficina.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import com.oficina.modelEnum.StatusPagamento;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
	
	private Date proximoVencimento;
	
	private double saldoDevedor;
	
	@Enumerated(EnumType.STRING)
	private StatusPagamento statusPagamento;
	
	//chave estrangeira id_OrdemServico

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getUltimoPagamento() {
		return ultimoPagamento;
	}

	public void setUltimoPagamento(Date ultimoPagamento) {
		this.ultimoPagamento = ultimoPagamento;
	}

	public Date getProximoVencimento() {
		return proximoVencimento;
	}

	public void setProximoVencimento(Date proximoVencimento) {
		this.proximoVencimento = proximoVencimento;
	}

	public double getSaldoDevedor() {
		return saldoDevedor;
	}

	public void setSaldoDevedor(double saldoDevedor) {
		this.saldoDevedor = saldoDevedor;
	}

	public StatusPagamento getStatusPagamento() {
		return statusPagamento;
	}

	public void setStatusPagamento(StatusPagamento statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatusOrdemServico other = (StatusOrdemServico) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
		
}
