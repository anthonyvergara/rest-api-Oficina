package com.oficina.service;

import java.util.List;

public interface GenericService<T> {
	public List<T> findAll();
	public T findById(Long id);
	public T save(T cliente);
	public void update(T cliente);
	public void delete(T cliente);
	public void deleteById(T cliente);
}
