package com.examples.jpa.carrental.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.examples.jpa.carrental.entidades.Reserva;
import com.examples.jpa.carrental.entidades.Vehiculo;
import com.examples.jpa.carrental.repositorios.ReservaRepositorio;
import com.examples.jpa.carrental.servicios.IAutoServicio;
import com.examples.jpa.carrental.servicios.IReservaServicio;

public class ReservaServicio implements IReservaServicio {

    @Autowired
    private ReservaRepositorio reservaRepo;

    @Autowired
    private IAutoServicio autoServicio;

    @Override
    public Reserva crearReserva(Reserva datosReserva) throws Exception {
        Vehiculo auto = autoServicio.obtenerAuto(datosReserva.getAuto().getIdVehiculo());

        return null;
    }

}
