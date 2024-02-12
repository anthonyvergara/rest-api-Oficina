package com.oficina.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.HttpAccessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oficina.model.Usuario;
import com.oficina.repository.UsuarioRepository;
import com.oficina.service.UsuarioService;

@RestController //ARQUITETURA REST
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired // Faz a injeção de dependencia
	UsuarioService usuarioService;
	//SERVIÇO RESTFULL
	
	/*@GetMapping(value = "/")
	public ResponseEntity getNome(@RequestParam(value = "nome") String nome ) {
		return new ResponseEntity("nome: "+nome,HttpStatus.OK);
	}*/
	
	/*@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> user(@PathVariable(value = "id") Long id){
		
		Optional<Usuario> usuarios = usuarioRepository.findById(id);
		
		if(usuarios.isPresent()) {
			return new ResponseEntity(usuarios.get(), HttpStatus.OK);
		}
		
		return new ResponseEntity(usuarios, HttpStatus.BAD_REQUEST);
		
	}*/
	@GetMapping(value = "/usuarios", produces = "application/json")
	public ResponseEntity<List<Usuario>> usuarios() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<Usuario> obj = usuarioService.findAll();
		
		if(!obj.isEmpty()) {
			return new ResponseEntity(obj, HttpStatus.OK);
		}
		
		return new ResponseEntity("", HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping(value="/", produces="application/json")
	public ResponseEntity<?> cadUser(@RequestBody Usuario user){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			usuarioService.save(user);
			map.put("status", 1);
			map.put("message", "Usuario salvo");
			return new ResponseEntity<>(map,HttpStatus.CREATED);
			
		}catch(Exception ex) {
			map.put("status", 0);
			map.put("message", "Erro ao salvar");
			return new ResponseEntity<>(map,HttpStatus.NOT_ACCEPTABLE);
		}
		
	}
	
	@GetMapping(value="usuarios/{id}",produces = "application/json")
	public ResponseEntity<Usuario> findbyId(@PathVariable Long id){
		
		Usuario user = usuarioService.findById(id);
		
		
		return new ResponseEntity<Usuario>(user,HttpStatus.OK);
	}
	
	/*
	@PostMapping(value = "/", produces="application/json")
	public ResponseEntity<Usuario> cadUser(@RequestBody Usuario user){
		
		for(Usuario nomes: usuarioRepository.findAll()) {
			if(user.getNome().equals(nomes.getNome())) {
				
				//if the name is in database, return reverse name.
				return new ResponseEntity(reverterString(user.getNome()),HttpStatus.BAD_REQUEST);
			}
		}
		
		Usuario usuario = usuarioRepository.save(user);
		
		
		return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
	}
	//ATUALIZA NOME DO USUARIO
	@PatchMapping(value = "/", produces="application/json")
	public ResponseEntity<Usuario> updtUser(@RequestBody Usuario user){
		
		Optional<Usuario> usuario = usuarioRepository.findById(user.getId());
		
		if(usuario.isPresent()) {
			Usuario updtUser = usuario.get();
			updtUser.setNome(user.getNome());
			
			usuarioRepository.save(updtUser);
			return new ResponseEntity<Usuario>(updtUser,HttpStatus.OK);
		}
		
		return new ResponseEntity("Nao encontrado",HttpStatus.BAD_REQUEST);
	}
	
	public String reverterString(String str) {
		
	//	String revertido = new StringBuilder(user.getNome()).reverse().toString(); - Ja existe uma classe para exercer essa ação.
		
		char nome[] = str.toCharArray();
		
		int qtd = nome.length;
		char nomeInvertido[] = new char[qtd];
		
		qtd = qtd-1;
		
		int i2 = 0;
		
		for(int i = qtd; i>=0; i--) {
			nomeInvertido[i2] = nome[i];
			i2++;
		}
		
		str = String.copyValueOf(nomeInvertido);
		
		return str;
	}
	*/
	
}
