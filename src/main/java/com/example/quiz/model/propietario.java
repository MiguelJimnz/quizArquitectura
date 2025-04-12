package com.example.quiz.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
public class propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_propietario;
    private String nombre;
    private String cedula;
    private LocalDate fecha_visita;
    private LocalTime hora_entrada;

    @OneToMany(mappedBy = "propietario")
    @JsonManagedReference //Este @ hace que no se referencien elementos entre sí, generando un ciclo de referencias
    private List<reserva_zona> reservas;

    @OneToMany(mappedBy = "propietario")
    @JsonManagedReference
    private List<reserva_parqueadero> reservasParqueadero;

    @OneToMany(mappedBy = "propietario")
    @JsonManagedReference
    private List<visitante> visitantes;


    public List<reserva_parqueadero> getReservasParqueadero() {
        return reservasParqueadero;
    }

    public void setReservasParqueadero(List<reserva_parqueadero> reservasParqueadero) {
        this.reservasParqueadero = reservasParqueadero;
    }

    public propietario() {
    }

    public propietario(int id_propietario, String nombre, String cedula, LocalDate fecha_visita, LocalTime hora_entrada) {
        this.id_propietario = id_propietario;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha_visita = fecha_visita;
        this.hora_entrada = hora_entrada;
    }

    public LocalTime getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(LocalTime hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
    }
}
