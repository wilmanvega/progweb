package com.examples.jpa.carrental.entidades;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPago;

    @ManyToOne
    @JoinColumn(name = "id_reserva")
    private Reserva reserva;
    private Date fechaPago;
    private Double valor;
    private MetodoPago metodoPago;

}
