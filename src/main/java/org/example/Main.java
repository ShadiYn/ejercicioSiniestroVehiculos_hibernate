package org.example;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion=0;
        Servicio servicio = new Servicio();
        Scanner e = new Scanner(System.in);
        do{
            System.out.println("Introduce la opcione que quieras realizar");
            System.out.println("1 - listar matricula de todos los vehiculos");
            System.out.println("2 - Listar matricula y marca de todos los vehiculos");
            System.out.println("3 - listar matricula de los vehiculos con mas de dos asientos y mas de dos ruedas");
            System.out.println("4 - listar matricula que tenga menos de 6 caracteres");
            System.out.println("5 - Listar matricula de vehiculo con un siniestro con perdida de mas de 1000€ ");
            System.out.println("6 - listar matricua de todos los vehiclos que hayan tenido un siniestro con perdida de mas de 1000 y mostrar a cuanto ha ascendido");
            opcion = e.nextInt();
            switch(opcion){
                case 1:
                    List<Vehiculo> vehiculos = servicio.mostrarMatricula();
                    System.out.println("matricula: "+vehiculos.getFirst());

                    break;

                case 2:
                    break;
            }
        }while(opcion !=5);

    }
}