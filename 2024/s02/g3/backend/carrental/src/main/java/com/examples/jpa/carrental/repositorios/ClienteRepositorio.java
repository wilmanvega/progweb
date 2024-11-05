package com.examples.jpa.carrental.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.examples.jpa.carrental.entidades.Cliente;

public interface ClienteRepositorio extends CrudRepository<Cliente, Integer> {

}
