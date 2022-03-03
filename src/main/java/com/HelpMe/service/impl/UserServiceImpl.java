package com.HelpMe.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HelpMe.entity.User;
import com.HelpMe.repository.IUserRepo;
import com.HelpMe.service.IUserService;



@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepo repo;

	@Override
	public void save(User user) {

		repo.save(user);

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

}
