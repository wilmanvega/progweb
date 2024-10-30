package com.spring.ejemplos.crudgrupo2.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.ejemplos.crudgrupo2.entidades.Carro;

@RepositoryRestResource(collectionResourceRel = "carros", path = "carros")
public interface CarroRepositorio extends CrudRepository<Carro, Long> {

}
