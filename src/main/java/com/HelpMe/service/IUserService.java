package com.HelpMe.service;

import java.util.List;
import java.util.Optional;

import com.HelpMe.entity.User;


public interface IUserService {
	public void save(User user);
	public List<User> all();
	public Optional<User> getById(Integer id);
	public void delete(Integer id);
	public void update(User user);

}
