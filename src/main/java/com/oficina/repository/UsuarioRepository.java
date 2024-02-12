package com.oficina.repository;

import org.springframework.data.repository.CrudRepository;

import com.oficina.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
