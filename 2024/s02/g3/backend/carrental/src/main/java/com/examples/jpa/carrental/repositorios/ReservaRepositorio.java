package com.examples.jpa.carrental.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.examples.jpa.carrental.entidades.Reserva;

public interface ReservaRepositorio extends CrudRepository<Reserva, Integer> {

}
