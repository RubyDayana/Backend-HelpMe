package com.HelpMe.service;

import java.util.List;
import java.util.Optional;

import com.HelpMe.entity.User;
import com.HelpMe.exception.ConflictException;


public interface IUserService extends ICrud<User, String> {
	
	public List<User> all();
	public Optional<User> getUser(String document);
	public boolean delete(String document);
	public void update(User user) throws ConflictException;

}
