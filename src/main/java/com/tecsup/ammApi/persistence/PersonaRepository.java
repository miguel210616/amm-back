package com.tecsup.ammApi.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tecsup.ammApi.persistence.crud.PersonRepository;
import com.tecsup.ammApi.persistence.crud.PersonaCrudRepository;
import com.tecsup.ammApi.persistence.entity.Persona;

@Repository
public class PersonaRepository implements PersonRepository{

	@Autowired
	private PersonaCrudRepository personaCrudRepository;
	
	@Override
	public Persona save(Persona persona) {
		return personaCrudRepository.save(persona);
	}

	@Override
	public List<Persona> getAll() {
		return (List<Persona>)personaCrudRepository.findAll();
	}

	@Override
	public Persona getByDni(int dni) {
		return personaCrudRepository.findByDni(dni);
	}

	@Override
	public void update(Persona persona) {
		personaCrudRepository.save(persona);
	}

	@Override
	public void deleteById(String id) {
		personaCrudRepository.deleteById(id);
	}

	@Override
	public void deleteByDni(int dni) {
		personaCrudRepository.deleteByDni(dni);
	}

}
