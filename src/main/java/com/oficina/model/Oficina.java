package com.oficina.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Oficina implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String rua;
	
	private int numero;
	
	private String postcode;
	
	private String cidade;
	
	private Long vatNumber;
	
	private Long companyNumber;
	
	@OneToMany(mappedBy = "oficina", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<OrdemServico> ordemServico = new ArrayList<OrdemServico>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "oficina_donoOficina", joinColumns = {@JoinColumn(name = "id_oficina")}, inverseJoinColumns = {@JoinColumn(name="id_donoOficina")})
	private List<DonoOficina> donoOficina = new ArrayList<DonoOficina>();
	

	public List<DonoOficina> getDonoOficina() {
		return donoOficina;
	}

	public void setDonoOficina(List<DonoOficina> donoOficina) {
		this.donoOficina = donoOficina;
	}

	public List<OrdemServico> getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(List<OrdemServico> ordemServico) {
		this.ordemServico = ordemServico;
	}

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

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Long getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(Long vatNumber) {
		this.vatNumber = vatNumber;
	}

	public Long getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(Long companyNumber) {
		this.companyNumber = companyNumber;
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
		Oficina other = (Oficina) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
