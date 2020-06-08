package com.fang.springjpademo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fang.springjpademo.model.Dipendente;

@Repository
public interface DipendenteRepository extends CrudRepository<Dipendente, Integer>{

	List<Dipendente> findByAzienda_Id(int id);
}
