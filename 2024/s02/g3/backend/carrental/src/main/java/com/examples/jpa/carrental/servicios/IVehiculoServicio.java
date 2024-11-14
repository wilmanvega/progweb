package com.examples.jpa.carrental.servicios;

import java.util.List;

import com.examples.jpa.carrental.entidades.Vehiculo;

public interface IVehiculoServicio {

    Vehiculo crearVehiculo(Vehiculo datos);

    Vehiculo obtenerVehiculo(Integer id);

    List<Vehiculo> obtenerVehiculos();

}
