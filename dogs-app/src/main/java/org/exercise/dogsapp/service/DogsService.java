package org.exercise.dogsapp.service;

import java.util.ArrayList;
import java.util.List;

import org.exercise.dogsapp.model.Dogs;
import org.exercise.dogsapp.repository.DogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DogsService {
	
	public final List<Dogs> dogsList = new ArrayList<>();
	
	@Autowired
	private DogsRepository dogsRepository;

	public List<Dogs> getAllDogs() {
		if(dogsRepository.findAll().isEmpty()) {
			dogsList.add(new Dogs("Chief", "Black (formely) White with black spots", 2, "https://revistacavecanem.com/wp-content/uploads/2020/11/IMG-20201105-WA0001-edited.jpg"));
			dogsList.add(new Dogs("Spots", "White with black spots, he is a bodyguard", 2, "https://revistacavecanem.com/wp-content/uploads/2020/11/IMG-20201105-WA0001-edited.jpg"));
			dogsList.add(new Dogs("King", "Black (formely) White with black spots", 2, "https://revistacavecanem.com/wp-content/uploads/2020/11/IMG-20201105-WA0001-edited.jpg"));
			dogsRepository.saveAll(dogsList);
			log.info("Retrieving Data from dogsList and saving data in DB");
			return dogsList;
		}else {
			log.info("Retrieving Data from DB");
			return dogsRepository.findAll();
		}
	}

}
