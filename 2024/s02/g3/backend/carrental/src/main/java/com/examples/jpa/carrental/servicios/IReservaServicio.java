package com.examples.jpa.carrental.servicios;

import com.examples.jpa.carrental.entidades.Reserva;


public interface IReservaServicio {

    Reserva crearReserva(Integer idVehiculo, Integer idCliente) throws Exception;
}
