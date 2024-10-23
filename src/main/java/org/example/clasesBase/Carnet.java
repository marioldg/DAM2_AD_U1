package org.example.clasesBase;

import java.util.Date;

public class Carnet {
    private long idEntrenador;
    private Date fechaExpedicion;
    private float puntos;
    private int numVictorias;

    //Constructores
    public Carnet(long idEntrenador, Date fechaExpedicion, float puntos, int numVictorias) {

        this.idEntrenador = idEntrenador;
        this.fechaExpedicion = fechaExpedicion;
        this.puntos = puntos;
        this.numVictorias = numVictorias;
    }

    public Carnet() {

    }




}

