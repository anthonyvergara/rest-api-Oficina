package com.oficina.service;

import java.util.List;

import com.oficina.model.Cliente;

public interface ClienteService {
	
	public List<Cliente> findAll();
	public Cliente findById(Long id);
	public Cliente save(Cliente cliente);
	public void update(Cliente cliente);
	public void delete(Cliente cliente);
	public void deleteById(Cliente cliente);
	   
}
