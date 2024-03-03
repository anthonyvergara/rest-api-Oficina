package com.oficina.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oficina.model.Cliente;
import com.oficina.repository.ClienteRepository;
import com.oficina.service.ClienteService;
import com.oficina.service.GenericService;

@Service
public class ClienteServiceImpl implements GenericService<Cliente>{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente save(Cliente cliente) {
		
		return clienteRepository.save(cliente);
	}

	@Override
	public void update(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
