package com.fang.springjpademo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fang.springjpademo.model.Dipendente;
import com.fang.springjpademo.repositories.DipendenteRepository;

@RestController
@RequestMapping("/dipendenti")
public class DipendenteController {
	@Autowired
	private DipendenteRepository db;

	@GetMapping
	public Iterable<Dipendente> get(@RequestParam(defaultValue = "0") int idAzienda) {
		if (idAzienda > 0)
			return db.findByAzienda_Id(idAzienda);
		
		return db.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Dipendente> getOne(@PathVariable int id) {
		return db.findById(id);
	}

	@PostMapping
	public void add(@RequestBody Dipendente dipendente) {
		db.save(dipendente);
	}
}
