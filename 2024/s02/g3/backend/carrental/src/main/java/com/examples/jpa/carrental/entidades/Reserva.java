package com.examples.jpa.carrental.entidades;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Reserva {
    @Id
    private Integer idReserva;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "idVehiculo")
    private Vehiculo auto;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    @OneToMany
    private List<Pago> pagos;

    private Double total;

}
