package com.examples.jpa.carrental.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.examples.jpa.carrental.entidades.Vehiculo;

public interface VehiculoRepositorio extends CrudRepository<Vehiculo, Integer> {

}
