package com.HelpMe.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ICrud <T, ID>{

	public Page<T> retornarPaginado(int page, int size);

	public Page<T> all(Pageable page);

	public T retonarPorId(ID idUser) ;

	public void save(T user);

	public void update(T user);

	public void delete(int idUser);
}
