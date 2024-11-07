package com.examples.jpa.carrental.servicios;

import org.springframework.stereotype.Service;

import com.examples.jpa.carrental.entidades.Cliente;

@Service
public interface IClienteServicio {
    Cliente crearCliente(Cliente datosCliente) throws Exception;

    Cliente obtenerClientePorId(Integer id) throws Exception;
}
