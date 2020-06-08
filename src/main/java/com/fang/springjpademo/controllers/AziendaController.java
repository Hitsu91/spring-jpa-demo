package com.fang.springjpademo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fang.springjpademo.model.Azienda;
import com.fang.springjpademo.repositories.AziendaRepository;

@RestController
@RequestMapping("/aziende")
public class AziendaController {
	
	@Autowired
	private AziendaRepository db;
	
	@GetMapping
	public Iterable<Azienda> get() {
		return db.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Azienda> get(@PathVariable int id) {
		return db.findById(id);
	}
	
	@PostMapping
	public void add(@RequestBody Azienda azienda) {
		db.save(azienda);
	}
	
	
}
