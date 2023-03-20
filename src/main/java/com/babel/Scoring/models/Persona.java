package com.babel.Scoring.models;

import java.util.Date;
import java.util.List;

public class Persona {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int direccionDomicilio;
    private int direccionNotificacion;
    private String nif;
    private String nacionalidad;
    private int scoring;
    private List<Telefono> telefonos;
    private Date fechaNacimiento;
    private Date fechaScoring;

}
