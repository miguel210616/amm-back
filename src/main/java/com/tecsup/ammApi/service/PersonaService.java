package com.tecsup.ammApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecsup.ammApi.persistence.PersonaRepository;
import com.tecsup.ammApi.persistence.entity.Persona;


@Service
@Transactional
public class PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;

	public Persona save(Persona persona) {
		return personaRepository.save(persona);
	}
	
	public List<Persona> getAll(){
		return personaRepository.getAll();
	}
		
	public Persona getByDni(int dni) {
		return personaRepository.getByDni(dni);
	}
	
	public void update(Persona persona) {
		personaRepository.update(persona);
	}
	
	public void deleteById(String id) {
		personaRepository.deleteById(id);
	}
	
	public void deleteByDni(int dni) {
		personaRepository.deleteByDni(dni);
	}
	
}
