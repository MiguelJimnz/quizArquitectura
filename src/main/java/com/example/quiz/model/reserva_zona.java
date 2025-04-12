package com.example.quiz.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class reserva_zona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id_reserva;
    private LocalDate   fecha;
    private LocalTime hora_inicio;
    @ManyToOne
    @JoinColumn(name = "id_zona")
    private zona_social zonaSocial;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    @JsonBackReference
    private propietario propietario;


    public reserva_zona() {
    }

    public reserva_zona(int id_reserva, LocalDate fecha, LocalTime hora_inicio, zona_social zonaSocial, propietario propietario) {
        this.id_reserva = id_reserva;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.zonaSocial = zonaSocial;
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

    public LocalTime getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(LocalTime hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public zona_social getZonaSocial() {
        return zonaSocial;
    }

    public void setZonaSocial(zona_social zonaSocial) {
        this.zonaSocial = zonaSocial;
    }

    public propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(propietario propietario) {
        this.propietario = propietario;
    }
}
