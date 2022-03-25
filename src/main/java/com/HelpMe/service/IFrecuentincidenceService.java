package com.HelpMe.service;

import java.util.List;
import java.util.Optional;

import com.HelpMe.entity.FrecuentIncidence;

public interface IFrecuentincidenceService {

	
	public void save(FrecuentIncidence frecuent);
	public List<FrecuentIncidence> all();
	public Optional<FrecuentIncidence> getIncidence(String reference);
	public boolean delete(String reference);
	public void update(FrecuentIncidence frecuent);

}
