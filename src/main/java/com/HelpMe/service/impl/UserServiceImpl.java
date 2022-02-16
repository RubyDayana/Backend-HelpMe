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
	public Optional<User> getById(Integer id) {
		System.out.print("id service" + id);
		Optional<User> user = repo.findById(id);
		return user;
	}

	@Override
	public void delete(Integer id) {
		
		repo.deleteById(id);

	}

	@Override
	public void update(User user) {
		
		repo.save(user);
	}

}
