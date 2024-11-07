package com.examples.jpa.carrental.entidades;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Reserva {
    @Id
    private Integer idReserva;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "id_vehiculo")
    private Vehiculo auto;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    @OneToMany(mappedBy = "idPago")
    private List<Pago> pagos;

    private Double total;

}
