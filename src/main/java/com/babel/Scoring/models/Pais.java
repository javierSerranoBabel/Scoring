package com.babel.Scoring.models;

public class Pais {
    private String codProvincia;
    private String nombre;

    public Pais(String codProvincia, String nombre) {
        this.codProvincia = codProvincia;
        this.nombre = nombre;
    }

    public String getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(String codProvincia) {
        this.codProvincia = codProvincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
