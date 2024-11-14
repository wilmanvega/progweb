package com.examples.jpa.carrental.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.jpa.carrental.entidades.Cliente;
import com.examples.jpa.carrental.repositorios.ClienteRepositorio;
import com.examples.jpa.carrental.servicios.IClienteServicio;

@Service
public class ClienteServicioImpl implements IClienteServicio {

    @Autowired
    private ClienteRepositorio repo;

    @Override
    public Cliente crearCliente(Cliente datosCliente) throws Exception {
        return repo.save(datosCliente);
    }

    @Override
    public Cliente obtenerClientePorId(Integer id) throws Exception {
        return repo.findById(id).orElseThrow(() -> new Exception("Cliente no encontrado"));
    }

    @Override
    public List<Cliente> obtenerClientes() throws Exception {
        return (List<Cliente>) repo.findAll();
    }

}
