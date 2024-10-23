package org.example;

import org.example.clasesBase.*;
import org.example.controlFicheros.*;
import org.example.controlUsuarios.*;

import java.util.Scanner;

public class Main {
    public Scanner sc = new Scanner(System.in);
    public TipoUsuarios user = TipoUsuarios.Invitado;

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main() {
        inicio();

    }
    public void inicio(){
        int indice;
        do{
            System.out.println("Eres el inivtado opciones:\n" +
                    "1-logIn \n" +
                    "2-Nuevo Entrenador \n" +
                    "0-salir" );
            indice = Integer.parseInt((sc.nextLine()));
            switch (indice) {
                case 1: logIn(); break;
                case 2:nuevoEntrenador(); break;
                default: System.out.println("Opcion no valida"); break;
            }
        }while(indice!=0);

    }
    public void logIn(){
    /*
    Llamar a controlFicheros
    Pedir ruta
    ller txt
    ----
    Exam si og correcto
    Si no error
    ----
    case de opciones por ususario
     */
    }

    public void nuevoEntrenador(){
        System.out.println("Ingrese el nombre del entrenador");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la nacionalidad del entrenador");
        String nacionalidad = sc.nextLine();
        System.out.println("Ingrese el id");
        int id = Integer.parseInt(sc.nextLine());
        Entrenador nuevoEntrenador = new Entrenador(id, nombre, nacionalidad);
    }
}