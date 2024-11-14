package com.examples.jpa.carrental.servicios.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.jpa.carrental.entidades.Cliente;
import com.examples.jpa.carrental.entidades.Reserva;
import com.examples.jpa.carrental.entidades.Vehiculo;
import com.examples.jpa.carrental.repositorios.ReservaRepositorio;
import com.examples.jpa.carrental.servicios.IVehiculoServicio;
import com.examples.jpa.carrental.servicios.IClienteServicio;
import com.examples.jpa.carrental.servicios.IReservaServicio;

@Service
public class ReservaServicioImpl implements IReservaServicio {

    @Autowired
    private ReservaRepositorio repo;

    @Autowired
    private IVehiculoServicio vehiculoServicio;

    @Autowired
    private IClienteServicio clienteServicio;

    @Override
    public Reserva crearReserva(Integer idVehiculo, Integer idCliente) throws Exception {
        Vehiculo auto = vehiculoServicio.obtenerVehiculo(idVehiculo);
        Cliente cliente = clienteServicio.obtenerClientePorId(idCliente);
        Reserva reserva = new Reserva();
        reserva.setAuto(auto);
        reserva.setCliente(cliente);
        reserva.setFechaInicio(new Date());
        return repo.save(reserva);
    }
}
