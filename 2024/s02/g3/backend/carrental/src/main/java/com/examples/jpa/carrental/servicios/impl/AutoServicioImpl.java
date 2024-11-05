package com.examples.jpa.carrental.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.examples.jpa.carrental.entidades.Vehiculo;
import com.examples.jpa.carrental.repositorios.VehiculoRepositorio;
import com.examples.jpa.carrental.servicios.IAutoServicio;

public class AutoServicioImpl implements IAutoServicio {

    @Autowired
    private VehiculoRepositorio autoRepo;

    @Override
    public Vehiculo obtenerAuto(Integer id) throws Exception {
        Vehiculo vehiculo = autoRepo.findById(id).orElseThrow(() -> new Exception("Vehiculo no encontrado"));
        return vehiculo;
    }

}
