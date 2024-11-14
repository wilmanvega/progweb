package com.examples.jpa.carrental.controladores;

import org.springframework.web.bind.annotation.RestController;

import com.examples.jpa.carrental.entidades.Vehiculo;
import com.examples.jpa.carrental.servicios.IVehiculoServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/rentas")
public class VehiculoControlador {

    @Autowired
    private IVehiculoServicio vehiculoServicio;

    @GetMapping("/vehiculos")
    public ResponseEntity<List<Vehiculo>> getMethodName() {
        List<Vehiculo> vehiculos = vehiculoServicio.obtenerVehiculos();
        return new ResponseEntity<>(vehiculos, HttpStatus.OK);

    }

    @PostMapping("/vehiculos")
    public String crearVehiculo(@RequestBody Vehiculo vehiculo) {
        Vehiculo vehiculoNuevo;
        try {
            vehiculoNuevo = vehiculoServicio.crearVehiculo(vehiculo);
            return vehiculoNuevo.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }

}
