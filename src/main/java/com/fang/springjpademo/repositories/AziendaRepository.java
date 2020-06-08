package com.fang.springjpademo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fang.springjpademo.model.Azienda;

@Repository
public interface AziendaRepository extends CrudRepository<Azienda, Integer>{

}
