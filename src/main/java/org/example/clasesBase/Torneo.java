package org.example.clasesBase;

import java.util.ArrayList;

public class Torneo {
    private int id;
    private String nombre;
    private char codRegion;
    private float PuntosVictoria;

    // LOs ptos que ganas

    private int puntos = (int)(Math.random() * 51) + 50;

	/*

	//Num de combates, dice que son 3
	private Combate[]combates = new Combate [3];

	//Numero de participantes

	private Entrenador [] entrenadores = new Entrenador[6];

	*/

    //LO hacemos con arraylist para no tener problema con el numero de entrenadores, ni combates.
    private ArrayList <Entrenador>entrenadores = new ArrayList<>();
    private ArrayList <Combate>combates = new ArrayList<>();

    //Añadimos nuevo entrenador a la lista de entrenadores;

    public void añadirEntrenadores(long idEntrenador, String nombreEntreandor,  String nacionalidadEntrenador)
    {
        entrenadores.add(new Entrenador(idEntrenador, nombreEntreandor, nacionalidadEntrenador));
    }

    //Construcotr

    public Torneo(int id, String nombre, char codRegion, float puntosVictoria, int puntos,
                  ArrayList<Entrenador> entrenadores, ArrayList<Combate> combates) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.codRegion = codRegion;
        PuntosVictoria = puntosVictoria;
        this.puntos = puntos;
        this.entrenadores = entrenadores;
        this.combates = combates;
    }

    public Torneo(int id, String nombre, char codRegion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.codRegion = codRegion;
    }

    public Torneo()
    {

    }

    //Getters SEtters

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

    public char getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(char codRegion) {
        this.codRegion = codRegion;
    }

    public float getPuntosVictoria() {
        return PuntosVictoria;
    }

    public void setPuntosVictoria(float puntosVictoria) {
        PuntosVictoria = puntosVictoria;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(ArrayList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    public ArrayList<Combate> getCombates() {
        return combates;
    }

    public void setCombates(ArrayList<Combate> combates) {
        this.combates = combates;
    }







}