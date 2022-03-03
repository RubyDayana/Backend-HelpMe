package com.HelpMe.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HelpMe.entity.User;
import com.HelpMe.service.IUserService;


@RequestMapping("/user")
@RestController
@CrossOrigin("*")
@Validated
public class userController {

	@Autowired
	private IUserService service;

	@PostMapping(value = "/save")
	public ResponseEntity<?> save(@RequestBody User user) {

		service.save(user);
		System.out.print("Entro mondog");

		return new ResponseEntity<Object>(user, HttpStatus.CREATED);
	}

	@GetMapping(value = "/all", produces = "application/json")
	public ResponseEntity<?> all(User user) {
		List<User> list = service.all();

		return new ResponseEntity<>(list, HttpStatus.OK);

	}

	@GetMapping(value = "/getUser/{document}", produces = "application/json")
	public ResponseEntity<?> getUser(@PathVariable String document) {
		System.out.print("nombre" + document);
		Optional<User> user = service.getUser(document);

		return new ResponseEntity<>(user, HttpStatus.OK);

	}

	@PutMapping(value = "/update", consumes = "application/json")
	public ResponseEntity<?> update(@RequestBody User user) {
		service.update(user);

		return new ResponseEntity<Object>(user, HttpStatus.OK);
	}

	// 204
	@DeleteMapping(value = "/delete/{document}")
	public ResponseEntity<?> delete(@PathVariable String document) {
		service.delete(document);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
}
