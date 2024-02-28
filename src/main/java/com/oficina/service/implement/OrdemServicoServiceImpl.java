package com.oficina.service.implement;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
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
		
		List<OrdemServico> show = new ArrayList<OrdemServico>();
		for(OrdemServico op: ordemServicoRepository.findAll()) {
			LocalDate localDate = op.getDataInicio().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			System.err.println(localDate);
			show.add(op);
		}
		
		return show;
	}
	

	@Override
	public void save(OrdemServico ordemServico) {
		// TODO Auto-generated method stub
		Random invoiceNumber = new Random();
		ordemServico.setInvoiceNumber(invoiceNumber.nextLong(999999999));
		
		Date dataHoje = new Date();
		ordemServico.setDataInicio(dataHoje);
		
		
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
