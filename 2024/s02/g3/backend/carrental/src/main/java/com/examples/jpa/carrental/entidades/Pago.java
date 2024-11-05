package com.examples.jpa.carrental.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pago {
    private Integer idPago;

    @ManyToOne
    @JoinColumn(name = "idReserva")
    private Reserva reserva;
    private Date fechaPago;
    private Double valor;
    private MetodoPago metodoPago;

}
