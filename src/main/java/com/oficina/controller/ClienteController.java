package com.oficina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oficina.model.Cliente;
import com.oficina.service.ClienteService;
import com.oficina.service.GenericService;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

	
	@Autowired
	private GenericService<Cliente> clienteService;
	
	@GetMapping(value = "/")
	private ResponseEntity<List<Cliente>> lista(){
		
		return ResponseEntity.ok(clienteService.findAll());
	}
	
	@PostMapping(value = "/")
	private ResponseEntity<Cliente> insertCliente(@RequestBody Cliente cliente){
		
		return ResponseEntity.ok().body(clienteService.save(cliente));
	}
	
}
