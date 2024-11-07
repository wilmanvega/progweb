package com.examples.jpa.carrental.entidades;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    @OneToMany(mappedBy = "idReserva")
    private List<Reserva> reservas;

}
