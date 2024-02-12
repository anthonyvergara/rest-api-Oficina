package com.oficina.service;

import java.util.List;

import com.oficina.model.Usuario;

public interface UsuarioService {
	
	public List<Usuario> findAll();
	public void save(Usuario user);
	public Usuario findById(Long id);
	public void deleteById(Integer id);
	public void deleteUser(Usuario user);
	public void updateUser(Usuario user);

}
