package org.example.clasesBase;

public class Entrenador {
    private long id;
    private String nombre, nacionalidad;

    /*
     * Como el entrenador tiene un carnet, tenemos que crear un carnet
     * LO iniciamos con constructor vacio, luego lo llenamos.
     */

    private Carnet carnet;

    //COnstrucot de entrenadores

    public Entrenador(long id, String nombre, String nacionalidad, Carnet carnet) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.carnet = carnet;
    }

    //Creamos un constructor sin el carnet

    public Entrenador(long id, String nombre, String nacionalidad ){
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        //this.carnet = carnet;
    }

    public Entrenador() {
        super();
    }

    //GEtters setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Carnet getCarnet() {
        return carnet;
    }

    public void setCarnet(Carnet carnet) {
        this.carnet = carnet;
    }






}

