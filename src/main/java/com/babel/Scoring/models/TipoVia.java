package com.babel.Scoring.models;

public class TipoVia {
    private int tipoViaId;
    private String descripcion;

    public TipoVia(int tipoViaId, String descripcion) {
        this.tipoViaId = tipoViaId;
        this.descripcion = descripcion;
    }

    public int getTipoViaId() {
        return tipoViaId;
    }

    public void setTipoViaId(int tipoViaId) {
        this.tipoViaId = tipoViaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
