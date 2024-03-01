package com.oficina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oficina.model.OrdemServico;
import com.oficina.service.OrdemServicoService;

@RestController
@RequestMapping(value = "/ordemservico")
public class OrdemServicoController {
	
	@Autowired
	private OrdemServicoService ordemServicoService;
	
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<List<OrdemServico>> listarServicos(){
		
		return ResponseEntity.ok(ordemServicoService.findAll());
	}
	
	@PostMapping(value = "/", produces = "application/json")
	public ResponseEntity<OrdemServico> insertOrdemServico(@RequestBody OrdemServico ordemServico){
		
		
		return ResponseEntity.ok().body(ordemServicoService.save(ordemServico));
	}
	
}
