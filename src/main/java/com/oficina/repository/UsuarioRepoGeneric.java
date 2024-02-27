package com.oficina.repository;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepoGeneric<T> extends CrudRepository<T,Long>{

}
