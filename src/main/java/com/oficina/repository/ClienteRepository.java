package com.oficina.repository;

import org.springframework.data.repository.CrudRepository;

import com.oficina.model.Cliente;

public interface ClienteRepository<T> extends CrudRepository<T, Long>{

}
