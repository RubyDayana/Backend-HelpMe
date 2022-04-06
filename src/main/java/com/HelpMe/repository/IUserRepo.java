package com.HelpMe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.HelpMe.entity.User;

public interface IUserRepo extends MongoRepository<User, String> {
	
	public Boolean existsByDocument(String document);
	public Boolean existsByEmail(String email);
	//public Boolean existsByUserName(String username);

}
