package com.example.quiz.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class reserva_parqueadero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_reserva;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private propietario propietario;

    public reserva_parqueadero() {
    }

    public reserva_parqueadero(int id_reserva, LocalDate fecha, propietario propietario) {
        this.id_reserva = id_reserva;
        this.fecha = fecha;
        this.propietario = propietario;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(propietario propietario) {
        this.propietario = propietario;
    }
}
