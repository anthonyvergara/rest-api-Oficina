package com.oficina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oficina.model.Usuario;
import com.oficina.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioRepository.findAll();
	}

	@Override
	public void save(Usuario user) {
		
		if(user.getNome().equals("admin")) {
			user.setSenha("root");
			usuarioRepository.save(user);
		}
		
	}

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Usuario> user = usuarioRepository.findById(id);
		
		if(user.isEmpty()) {
			Usuario uu = new Usuario();
			return uu;
		}
		
		return user.get();
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Usuario user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(Usuario user) {
		// TODO Auto-generated method stub
		
	}

}
