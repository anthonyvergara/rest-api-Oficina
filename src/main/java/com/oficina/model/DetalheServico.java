package com.oficina.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DetalheServico implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String placa;
	
	private int quantidade;
	
	private String detalheServico;
	
	private int milhagem;
	
	private Date data;
	
	private double valor;
	
	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDetalheServico() {
		return detalheServico;
	}

	public void setDetalheServico(String detalheServico) {
		this.detalheServico = detalheServico;
	}

	public int getMilhagem() {
		return milhagem;
	}

	public void setMilhagem(int milhagem) {
		this.milhagem = milhagem;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
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
		DetalheServico other = (DetalheServico) obj;
		return Objects.equals(id, other.id);
	}
	

}
