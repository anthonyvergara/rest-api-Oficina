package com.oficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oficina.model.Cliente;
import com.oficina.service.ClienteService;

@RestController
@RequestMapping(value = "cliente")
public class ClienteController {

	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping(name = "/")
	private ResponseEntity<Cliente> insertCliente(@RequestBody Cliente cliente){
		
		return ResponseEntity.ok().body(clienteService.save(cliente));
	}
	
}
