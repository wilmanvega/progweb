package com.examples.jpa.carrental.servicios;

import java.util.List;

import com.examples.jpa.carrental.entidades.Cliente;


public interface IClienteServicio {
    Cliente crearCliente(Cliente datosCliente) throws Exception;

    Cliente obtenerClientePorId(Integer id) throws Exception;

    List<Cliente> obtenerClientes() throws Exception;
}
