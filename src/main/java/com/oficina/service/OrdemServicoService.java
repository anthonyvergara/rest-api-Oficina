package com.oficina.service;

import java.util.List;

import com.oficina.model.OrdemServico;

public interface OrdemServicoService {
	
	public List<OrdemServico> findAll();
	public OrdemServico save(OrdemServico ordemServico);
	public OrdemServico findById(Long id);
	public void delete(OrdemServico ordemServico);
	public void deleteById(Integer id);
	public void update(OrdemServico ordemServico);
	
	

}
