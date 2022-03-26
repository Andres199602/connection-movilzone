package com.movilzone.appwebconectionbd.models;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class ProductsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String modelo;
    int marca_idmarca;
    int categoria_idcategoria;
    float precio;
    int stock;
    int status;
    String img;

    public ProductsModel() {
    }

    public ProductsModel(int id, String modelo, int marca_idmarca, int categoria_idcategoria, float precio, int stock, int status, String img) {
        this.id = id;
        this.modelo = modelo;
        this.marca_idmarca = marca_idmarca;
        this.categoria_idcategoria = categoria_idcategoria;
        this.precio = precio;
        this.stock = stock;
        this.status = status;
        this.img = img;
    }

    public ProductsModel(String modelo, int marca_idmarca, int categoria_idcategoria, float precio, int stock, int status, String img) {
        this.modelo = modelo;
        this.marca_idmarca = marca_idmarca;
        this.categoria_idcategoria = categoria_idcategoria;
        this.precio = precio;
        this.stock = stock;
        this.status = status;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMarca_idmarca() {
        return marca_idmarca;
    }

    public void setMarca_idmarca(int marca_idmarca) {
        this.marca_idmarca = marca_idmarca;
    }

    public int getCategoria_idcategoria() {
        return categoria_idcategoria;
    }

    public void setCategoria_idcategoria(int categoria_idcategoria) {
        this.categoria_idcategoria = categoria_idcategoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "ProductsModel{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca_idmarca=" + marca_idmarca +
                ", categoria_idcategoria=" + categoria_idcategoria +
                ", precio=" + precio +
                ", stock=" + stock +
                ", status=" + status +
                ", img='" + img + '\'' +
                '}';
    }
}
