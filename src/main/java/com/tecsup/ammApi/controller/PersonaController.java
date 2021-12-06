package com.tecsup.ammApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecsup.ammApi.persistence.entity.Persona;
import com.tecsup.ammApi.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	@PostMapping("/save")
	public Persona save(@RequestBody Persona persona) {
		return personaService.save(persona);
	}
	
	@GetMapping("/all")
	public List<Persona> getAll(){
		return personaService.getAll();
	}
		
	@GetMapping("/dni/{dni}")
	public Persona getByDni(@PathVariable("dni") int dni){
		return personaService.getByDni(dni);
	}
	
	@PutMapping("/update")
	public Persona update(@RequestBody Persona persona) {
		return personaService.save(persona);
	}
	
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable("id") String id) {
		personaService.deleteById(id);
	}
	
	@DeleteMapping("/dni/{dni}")
	public void deleteByDni(@PathVariable("dni") int dni) {
		personaService.deleteByDni(dni);
	}
	
}
