package org.exercise.dogsapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//POJO

@Entity
@Table(name="DOGS", schema = "DOGSDB")
public class Dogs {
	
	@Id
	@Column(name = "DOG_NAME", nullable = false)
	private String dogName;
	
	@Column(name = "DESCRIPTION", nullable = false)
	private String description;
	
	@Column(name = "AGE", nullable = false)
	private int age;
	
	@Column(name = "URL", nullable = false)
	private String url;
	
	public Dogs(String dogName, String description, int age, String url) {
		super();
		this.dogName = dogName;
		this.description = description;
		this.age = age;
		this.url = url;
	} //Constructor
	
	public Dogs() {
	} //Constructor

	public String getDogName() {
		return dogName;
	} //getDogName

	public void setDogName(String dogName) {
		this.dogName = dogName;
	} //setDogName

	public String getDescription() {
		return description;
	} //getDescription

	public void setDescription(String description) {
		this.description = description;
	} //setDescription

	public int getAge() {
		return age;
	} //getAge

	public void setAge(int age) {
		this.age = age;
	} //setAge

	public String getUrl() {
		return url;
	} //getUrl

	public void setUrl(String url) {
		this.url = url;
	} //setUrl

	@Override
	public String toString() {
		return "Dogs [dogName=" + dogName + ", description=" + description + ", age=" + age + ", url=" + url + "]";
	} //toString
	
}
