package org.exercise.dogsapp.controller;

import java.util.List;

import org.exercise.dogsapp.model.Dogs;
import org.exercise.dogsapp.service.DogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "/api/dogs/")
public class DogsController {
	private final DogsService dogsService;

	@Autowired
	public DogsController(DogsService dogsService) {
		this.dogsService = dogsService;
	} //Constructor
	
	@GetMapping
	public List<Dogs> getAllDogs(){
		return dogsService.getAllDogs();
	}
	
	

}
