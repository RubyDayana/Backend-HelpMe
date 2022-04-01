package com.HelpMe.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("frecuentIncidence")
public class FrecuentIncidence {

	@Id
	private String reference;
	private String dateActual;
	private String title;
	private String description;
	private String answer;
	private File file;
	private String documentUser;

	public FrecuentIncidence() {
	}

	public FrecuentIncidence(String reference, String dateActual, String title, String description, String answer,
			File file, String documentUser) {
		this.reference = reference;
		this.dateActual = dateActual;
		this.title = title;
		this.description = description;
		this.answer = answer;
		this.file = file;
		this.documentUser = documentUser;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDateActual() {
		return dateActual;
	}

	public void setDateActual(String dateActual) {
		this.dateActual = dateActual;
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

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getDocumentUser() {
		return documentUser;
	}

	public void setDocumentUser(String documentUser) {
		this.documentUser = documentUser;
	}


}