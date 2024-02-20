package com.oficina.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.hibernate.annotations.ForeignKey;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class OrdemServico implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long invoiceNumber;
	
	private int vat;
	
	private Date dataInicio;
	
	private Double valorTotal;
	
	private String tipoPagamento;
	
	private String observacao;
	
	@ForeignKey(name="id_cliente")
	@ManyToOne
	private Cliente cliente;
	
	@ForeignKey(name = "id_oficina")
	@ManyToOne
	private Oficina oficina;
	
	@OneToMany(mappedBy = "ordemServico", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<DetalheServico> detalheServico = new ArrayList<DetalheServico>();
	
	@OneToMany(mappedBy = "ordemServico", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<Pagamento> pagamento  = new ArrayList<Pagamento>();

	@OneToMany(mappedBy = "ordemServico", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<StatusOrdemServico> statusOrdemServico = new ArrayList<StatusOrdemServico>();
	
	
	public List<StatusOrdemServico> getStatusOrdemServico() {
		return statusOrdemServico;
	}

	public void setStatusOrdemServico(List<StatusOrdemServico> statusOrdemServico) {
		this.statusOrdemServico = statusOrdemServico;
	}

	public List<Pagamento> getPagamento() {
		return pagamento;
	}

	public void setPagamento(List<Pagamento> pagamento) {
		this.pagamento = pagamento;
	}

	public List<DetalheServico> getDetalheServico() {
		return detalheServico;
	}

	public void setDetalheServico(List<DetalheServico> detalheServico) {
		this.detalheServico = detalheServico;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	public Long getInvoiceNumber() {
		return invoiceNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setInvoiceNumber(Long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
		OrdemServico other = (OrdemServico) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
