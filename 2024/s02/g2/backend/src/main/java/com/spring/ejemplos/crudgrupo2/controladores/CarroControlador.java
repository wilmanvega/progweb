package com.spring.ejemplos.crudgrupo2.controladores;

import org.springframework.web.bind.annotation.RestController;

import com.spring.ejemplos.crudgrupo2.entidades.Carro;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class CarroControlador {

    @GetMapping("/carros")
    public List<Carro> getCarros(@RequestParam String filtro) {
        return null;
    }

    @PostMapping("/carros")
    public Carro crearCarro(@RequestBody Carro entity) {
        // TODO: process POST request

        return entity;
    }

    @PutMapping("/carros/{id}")
    public Carro putMethodName(@PathVariable String id, @RequestBody Carro entity) {
        // TODO: process PUT request

        return entity;
    }

    @RequestMapping(path = "/carros/{id}", method = RequestMethod.DELETE)
    public void requestMethodName(@RequestParam String id) {
        // TODO: Codigo para eliminar
    }

}
