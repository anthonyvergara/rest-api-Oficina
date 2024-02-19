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
import jakarta.persistence.OneToMany;

@Entity
public class Cliente extends Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long documentoId;
	
	private Long driveId;
	
	private Long passaporte;
	
	private Long rg;
	
	@OneToMany(mappedBy = "cliente", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<OrdemServico> ordemServico = new ArrayList<OrdemServico>();

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

	public Long getDocumentoId() {
		return documentoId;
	}

	public void setDocumentoId(Long documentoId) {
		this.documentoId = documentoId;
	}

	public Long getDriveId() {
		return driveId;
	}

	public void setDriveId(Long driveId) {
		this.driveId = driveId;
	}

	public Long getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(Long passaporte) {
		this.passaporte = passaporte;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
