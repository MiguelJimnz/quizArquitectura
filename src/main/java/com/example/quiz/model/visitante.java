package com.example.quiz.model;

import jakarta.persistence.*;

@Entity
public class visitante {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id_visitante;
    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;
    @OneToMany
    @JoinColumn(name = "id_propietario")
    private propietario propietario;


    public visitante() {
    }

    public visitante(int id_visitante, String nombre, String cedula, String telefono, String correo, propietario propietario) {
        this.id_visitante = id_visitante;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.propietario = propietario;
    }

    public int getId_visitante() {
        return id_visitante;
    }

    public void setId_visitante(int id_visitante) {
        this.id_visitante = id_visitante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(propietario propietario) {
        this.propietario = propietario;
    }
}
