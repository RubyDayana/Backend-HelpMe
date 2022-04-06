package com.HelpMe.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.HelpMe.entity.User;
import com.HelpMe.exception.ConflictException;
import com.HelpMe.exception.ModelNotFoundException;
import com.HelpMe.repository.IUserRepo;
import com.HelpMe.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepo repo;

	@Override
	public void save(User user) throws ConflictException {

		if (repo.existsByDocument(user.getDocument())) {
			throw new ConflictException("Usuario ya existe");
		} else if (repo.existsByEmail(user.getEmail())) {
			throw new ConflictException("Email ya existe");
		} else {
			repo.save(user);
		}
	}

	@Override
	public List<User> all() {
		List<User> list = repo.findAll();
		return list;
	}

	@Override
	public Optional<User> getUser(String document) {
		System.out.print("id service" + document);
		Optional<User> user = repo.findById(document);
		return user;
	}

	@Override
	public boolean delete(String document) {

		Boolean aBoolean = getUser(document).map(user -> {
			repo.delete(user);
			return true;
		}).orElse(false);
		return aBoolean;

	}

	@Override
	public void update(User user) {

		repo.save(user);
	}

	@Override
	public Page<User> retornarPaginado(int page, int size) {
		return repo.findAll(PageRequest.of(page, size));
		
	}

	@Override
	public Page<User> all(Pageable page) {

		return repo.findAll(page);
	}

	@Override
	public User retonarPorId(String idUser) throws ModelNotFoundException {

		return repo.findById(idUser).orElseThrow(() -> new ModelNotFoundException("Usuario no encontrado"));
	}

	@Override
	public void delete(int idUser) {
		// TODO Auto-generated method stub

	}

}
