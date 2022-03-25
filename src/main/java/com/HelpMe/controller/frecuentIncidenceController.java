package com.HelpMe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HelpMe.entity.FrecuentIncidence;
import com.HelpMe.service.IFrecuentincidenceService;

@RequestMapping("/frecuentIncidence")
@RestController
@CrossOrigin("*")
@Validated
public class frecuentIncidenceController {

	
	
	@Autowired
	private IFrecuentincidenceService service;
	
	
	@PostMapping(value = "/save")
	public ResponseEntity<?> save(@RequestBody FrecuentIncidence frecuentIncidence) {

		service.save(frecuentIncidence);
		System.out.print("Entro mondog");

		return new ResponseEntity<Object>(frecuentIncidence, HttpStatus.CREATED);
	}

	@GetMapping(value = "/all", produces = "application/json")
	public ResponseEntity<?> all(FrecuentIncidence frecuentIncidence) {
		List<FrecuentIncidence> list = service.all();

		return new ResponseEntity<>(list, HttpStatus.OK);

	}

	@GetMapping(value = "/getIncidence/{reference}", produces = "application/json")
	public ResponseEntity<?> getIncidence(@PathVariable String reference) {
		System.out.print("nombre" + reference);
		Optional<FrecuentIncidence> frecuentIncidence = service.getIncidence(reference);

		return new ResponseEntity<>(frecuentIncidence, HttpStatus.OK);

	}

	@PutMapping(value = "/update", consumes = "application/json")
	public ResponseEntity<?> update(@RequestBody FrecuentIncidence frecuentIncidence) {
		service.update(frecuentIncidence);

		return new ResponseEntity<Object>(frecuentIncidence, HttpStatus.OK);
	}

	// 204
	@DeleteMapping(value = "/delete/{reference}")
	public ResponseEntity<?> delete(@PathVariable String reference) {
		service.delete(reference);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
}
