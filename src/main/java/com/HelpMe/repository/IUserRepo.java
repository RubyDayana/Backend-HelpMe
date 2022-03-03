package com.HelpMe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.HelpMe.entity.User;

public interface IUserRepo extends MongoRepository<User, String> {

}
