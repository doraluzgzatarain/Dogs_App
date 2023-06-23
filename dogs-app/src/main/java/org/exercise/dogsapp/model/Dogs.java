package org.exercise.dogsapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//POJO

@Entity
@Table(name="dogs")
public class Dogs {
	@Column(nullable = false)
	private String dogName;
	@Column(nullable = false)
	private String description;
	private int age;
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
