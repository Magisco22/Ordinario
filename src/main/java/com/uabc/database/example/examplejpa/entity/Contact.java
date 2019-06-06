package com.uabc.database.example.examplejpa.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="contact")
public class Contact {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "raza")
    private String raza;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "nacimiento")
    private String nacimiento;
    @Column(name = "adopcion")
    private String adopcion;


    public Contact(){

    }

    public Contact(String nombre, String raza, String tipo, String nacimiento, String adopcion) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
        this.nacimiento = nacimiento;
        this.adopcion = adopcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getAdopcion() {
        return adopcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setAdopcion(String adopcion) {
        this.adopcion = adopcion;
    }
}
