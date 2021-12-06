package com.tecsup.ammApi.persistence.crud;

import java.util.List;

import com.tecsup.ammApi.persistence.entity.Persona;

public interface PersonRepository {

	public Persona save(Persona persona);
	
	public List<Persona> getAll();
		
	public Persona getByDni(int dni);
		
	public void update(Persona persona);
		
	public void deleteById(String id);
	
	public void deleteByDni(int dni);
	
}
