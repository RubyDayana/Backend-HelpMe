package com.HelpMe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.HelpMe.entity.FrecuentIncidence;

public interface IFrecuentIncidenceRepo extends MongoRepository<FrecuentIncidence, String> {

}
