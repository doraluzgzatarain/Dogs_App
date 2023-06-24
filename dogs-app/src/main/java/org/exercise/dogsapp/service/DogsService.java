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
	private DogsRepository dogsRepository;
	
	@Autowired
	public DogsService(DogsRepository dogsRepository) {
		this.dogsRepository = dogsRepository;
	}

	public List<Dogs> getAllDogs() {
		if(dogsRepository.findAll().isEmpty()) {
			dogsList.add(new Dogs("Chief", "Black (formely) White with black spots", 2, "https://revistacavecanem.com/wp-content/uploads/2020/11/IMG-20201105-WA0001-edited.jpg"));
			dogsList.add(new Dogs("Spots", "White with black spots, he is a bodyguard", 2, "https://img.freepik.com/fotos-premium/cao-branco-de-raca-misturada-closeup-com-manchas-pretas_772720-1189.jpg?w=2000"));
			dogsList.add(new Dogs("King", "Red, Brown, White, he believes in democracy", 2, "https://us.123rf.com/450wm/adogslifephoto/adogslifephoto1806/adogslifephoto180600059/103304521-lindo-cachorro-de-raza-terrier-de-color-leonado-de-pie-al-lado-en-blanco-mirando-hacia-arriba.jpg?ver=6"));
			dogsRepository.saveAll(dogsList);
			log.info("Retrieving Data from dogsList and saving data in DB");
			return dogsList;
		}else {
			log.info("Retrieving Data from DB");
			return dogsRepository.findAll();
		}
	}

	

}
