package com.HelpMe.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.HelpMe.exception.ArgumentRequiredException;
import com.HelpMe.exception.ConflictException;
import com.HelpMe.exception.ModelNotFoundException;




public interface ICrud <T, ID>{

	public Page<T> retornarPaginado(int page, int size);

	public Page<T> all(Pageable page);

	public T retonarPorId(ID idUser) throws ModelNotFoundException ;

	public void save(T user) throws ConflictException, ModelNotFoundException;

	public void update(T user) throws ArgumentRequiredException, ModelNotFoundException, ConflictException;

	public void delete(int idUser) throws ModelNotFoundException;
}
