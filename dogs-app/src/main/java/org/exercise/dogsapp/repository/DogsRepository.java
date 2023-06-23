package org.exercise.dogsapp.repository;


import org.exercise.dogsapp.model.Dogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogsRepository extends JpaRepository<Dogs, String>{
	
} //Interface DogsRepository
