package com.babel.Scoring.models;

public class Telefono {
    private int telefonoId;
    private String telefono;

    //TODO:Constuctor


    public Telefono(int telefonoId, String telefono) {
        this.telefonoId = telefonoId;
        this.telefono = telefono;
    }

    public int getTelefonoId() {
        return telefonoId;
    }

    public void setTelefonoId(int telefonoId) {
        this.telefonoId = telefonoId;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
