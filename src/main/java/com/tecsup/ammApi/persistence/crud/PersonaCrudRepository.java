package com.tecsup.ammApi.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.tecsup.ammApi.persistence.entity.Persona;

public interface PersonaCrudRepository extends CrudRepository<Persona, String> {

	public Persona findByDni(int dni);
		
	public void deleteById(String id);
	
	public void deleteByDni(int dni);
	
}
