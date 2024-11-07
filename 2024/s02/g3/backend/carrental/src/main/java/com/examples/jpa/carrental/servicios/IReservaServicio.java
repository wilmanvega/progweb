package com.examples.jpa.carrental.servicios;

import org.springframework.stereotype.Service;

import com.examples.jpa.carrental.entidades.Reserva;

@Service
public interface IReservaServicio {

    Reserva crearReserva(Integer idVehiculo, Integer idCliente) throws Exception;
}
