package com.HelpMe.service;

import java.util.List;
import java.util.Optional;

import com.HelpMe.entity.User;


public interface IUserService {
	public void save(User user);
	public List<User> all();
	public Optional<User> getUser(String document);
	public boolean delete(String document);
	public void update(User user);

}