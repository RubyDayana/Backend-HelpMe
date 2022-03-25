package com.HelpMe.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HelpMe.entity.FrecuentIncidence;
import com.HelpMe.repository.IFrecuentIncidenceRepo;
import com.HelpMe.service.IFrecuentincidenceService;

@Service
public class FrecuentIncidenceService implements IFrecuentincidenceService {

	@Autowired
	private IFrecuentIncidenceRepo repo;

	@Override
	public void save(FrecuentIncidence frecuent) {
 
		repo.save(frecuent);

	}

	@Override
	public List<FrecuentIncidence> all() {
		
		List<FrecuentIncidence> list = repo.findAll();
		return list;
	}

	@Override
	public Optional<FrecuentIncidence> getIncidence(String reference) {
		
		Optional<FrecuentIncidence> frecuent = repo.findById(reference);
		return frecuent;
	}

	@Override
	public boolean delete(String reference) {
		
		Boolean aBoolean = getIncidence(reference).map(incidence -> {
			repo.delete(incidence);
			return true;
		}).orElse(false);
		return aBoolean;
	}

	@Override
	public void update(FrecuentIncidence frecuent) {
		
		repo.save(frecuent);

	}

}
