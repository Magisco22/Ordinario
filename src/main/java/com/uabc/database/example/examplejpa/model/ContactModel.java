package com.uabc.database.example.examplejpa.model;

public class ContactModel {
    private int id;
    private String nombre;
    private String raza;
    private String tipo;
    private String nacimiento;
    private String adopcion;

    public ContactModel(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getAdopcion() {
        return adopcion;
    }

    public void setAdopcion(String adopcion) {
        this.adopcion = adopcion;
    }


    @Override
    public String toString() {
        return "ContactModel{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nacimiento='" + nacimiento + '\'' +
                ", adopcion='" + adopcion + '\'' +
                '}';
    }
}
