package com.HelpMe.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
// import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("User")
public class User {

	@Id
	private Integer id;

	// @MongoId
	// private String id;

	private String name;
	private String document;
	private String email;
	private String phone;
	private String username;
	private String password;
	private String rol;

	public User(Integer id, String name, String document, String email, String phone, String username, String password,
			String rol) {
		super();
		this.id = id;
		this.name = name;
		this.document = document;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.rol = rol;
	}

	public User() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	

}
