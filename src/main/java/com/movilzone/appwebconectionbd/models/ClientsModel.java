package com.movilzone.appwebconectionbd.models;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class ClientsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String email;
    String password;
    int month;

    public ClientsModel() {
    }

    public ClientsModel(int id, String email, String password, int month) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.month = month;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "ClientsModel{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", month='" + month + '\'' +
                '}';
    }

    public String toJson() {
        return "{" +
                "\"id\":\"" + id + "\"," +
                "\"email\":\"" + email + "\"," +
                "\"password\":\"" + password + "\"," +
                "\"month\":\"" + month + "\"" +
                '}';
    }
}
