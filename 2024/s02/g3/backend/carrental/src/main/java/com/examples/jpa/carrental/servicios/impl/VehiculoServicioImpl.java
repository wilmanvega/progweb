package com.examples.jpa.carrental.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.examples.jpa.carrental.entidades.Vehiculo;
import com.examples.jpa.carrental.repositorios.VehiculoRepositorio;
import com.examples.jpa.carrental.servicios.IVehiculoServicio;

public class VehiculoServicioImpl implements IVehiculoServicio {

    @Autowired
    private VehiculoRepositorio repo;

    @Override
    public Vehiculo obtenerAuto(Integer id) throws Exception {
        return repo.findById(id).orElseThrow(() -> new Exception("Vehiculo no encontrado"));
    }
}