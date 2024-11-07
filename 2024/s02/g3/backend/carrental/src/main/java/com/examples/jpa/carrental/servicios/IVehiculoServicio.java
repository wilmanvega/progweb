package com.examples.jpa.carrental.servicios;

import org.springframework.stereotype.Service;

import com.examples.jpa.carrental.entidades.Vehiculo;

@Service
public interface IVehiculoServicio {

    Vehiculo obtenerAuto(Integer id) throws Exception;

}
