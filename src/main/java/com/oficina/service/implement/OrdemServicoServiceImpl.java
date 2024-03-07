package com.oficina.service.implement;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oficina.model.OrdemServico;
import com.oficina.repository.OrdemServicoRepository;
import com.oficina.service.OrdemServicoService;

@Service
public class OrdemServicoServiceImpl implements OrdemServicoService{
	
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	
	@Override
	public List<OrdemServico> findAll() {
		return (List<OrdemServico>) ordemServicoRepository.findAll();
	}
	

	@Override
	public OrdemServico save(OrdemServico ordemServico) {
		
		Random invoiceNumber = new Random();
		ordemServico.setInvoiceNumber(invoiceNumber.nextLong(999999999));
		
		LocalDate dataHoje = LocalDate.now();
		ordemServico.setDataInicio(dataHoje);
		
		return ordemServicoRepository.save(ordemServico);
	}

	@Override
	public OrdemServico findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(OrdemServico ordemServico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(OrdemServico ordemServico) {
		// TODO Auto-generated method stub
		
	}


}
