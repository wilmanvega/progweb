package com.examples.jpa.carrental.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.jpa.carrental.entidades.Vehiculo;
import com.examples.jpa.carrental.repositorios.VehiculoRepositorio;
import com.examples.jpa.carrental.servicios.IVehiculoServicio;

@Service
public class VehiculoServicioImpl implements IVehiculoServicio {

    @Autowired
    private VehiculoRepositorio repo;

    @Override
    public Vehiculo obtenerVehiculo(Integer id) {
        try {
            return repo.findById(id).orElseThrow(() -> new Exception("Vehiculo no encontrado"));
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Vehiculo> obtenerVehiculos() {
        List<Vehiculo> vehiculos = (List<Vehiculo>) repo.findAll();
        return vehiculos;
    }

    @Override
    public Vehiculo crearVehiculo(Vehiculo datos) {
        return repo.save(datos);
    }
}