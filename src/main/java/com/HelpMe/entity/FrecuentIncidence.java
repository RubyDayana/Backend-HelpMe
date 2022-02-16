package com.HelpMe.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("frecuentIncidence")
public class FrecuentIncidence {

	@Id
	private Integer id;

	private String title;
	private String description;
	private String answer;
	private String file;
	private int idUser;

	public FrecuentIncidence(Integer id, String title, String description, String answer, String file, int idUser) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.answer = answer;
		this.file = file;
		this.idUser = idUser;
	}

	public FrecuentIncidence() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

}
