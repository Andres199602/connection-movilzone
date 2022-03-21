package com.movilzone.appwebconectionbd.models;

import javax.persistence.*;

@Entity
@Table(name = "marca")
public class BrandsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String nombre;

    public BrandsModel() {
    }

    public BrandsModel(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public BrandsModel(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "BrandsModel{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
