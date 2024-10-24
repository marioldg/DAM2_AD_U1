package org.example;

import org.example.clasesBase.*;
//import org.example.controlFicheros.*;
import org.example.controlUsuarios.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public Scanner sc = new Scanner(System.in);
    public TipoUsuarios user = TipoUsuarios.Invitado;

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main() {

        login();

    }
    public void inicio(){
        int indice;
        do{
            System.out.println("Eres el invitado opciones:\n" +
                    "1-LogIn \n" +
                    "2-Nuevo Entrenador \n" +
                    "0-Salir" );
            indice = Integer.parseInt((sc.nextLine()));
            switch (indice) {
                case 1: //logIn(); break;
                case 2:nuevoEntrenador(); break;
                default: System.out.println("Opcion no valida"); break;
            }
        }while(indice!=0);

    }


    public static void login() {

        String file = "src/main/Files/Credenciales.txt";

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Ingrese su nombre de usuario: ");
            String username = scanner.nextLine();

            System.out.print("Ingrese su contraseña: ");
            String password = scanner.nextLine();

            boolean acceso = false;
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(","); //divide la linea con comas
                    if (parts[0].equals(username) && parts[1].equals(password)) { //si las credenciales coinciden
                        System.out.println("Login exitoso. \n Bienvenido " + username + ". Rol: " + parts[2]);
                        acceso = true;
                    }
                }


            } catch (IOException e) {
                e.printStackTrace();
            }

            if (!acceso) {

                System.out.println("Credenciales incorrectas. \n" +
                        "Si desea volver a intentarlo pulse 1. \n" +
                        "Si desea salir pulse 0.");
                String cod = scanner.nextLine();
                if(cod.equals("0")){
                    break;
                }
            }else{
                break;
            }
        }
    }


    public void crearTorneo(){
        int indice;
        do{
            System.out.println("Eres el invitado opciones:\n" +
                    "1-logIn \n" +
                    "2-Nuevo Entrenador \n" +
                    "0-salir" );
            indice = Integer.parseInt((sc.nextLine()));
            switch (indice) {
                case 1: //logIn(); break;
                case 2:nuevoEntrenador(); break;
                default: System.out.println("Opcion no valida"); break;
            }
        }while(indice!=0);

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

    public void nuevoTorneo(){
        System.out.println("Ingrese el nombre del torneo");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el nombre del administrador");
        String nombreAdmin = sc.nextLine();
        System.out.println("Teclee la contraseña");
        String password = sc.nextLine();
        System.out.println("Ingrese el id");
        int id = Integer.parseInt(sc.nextLine());
        Torneo nuevoTorneo = new Torneo(id, nombre, nombreAdmin, password, id);
    }

}