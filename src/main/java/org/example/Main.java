package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion=0;
        List<Siniestro> siniestros1 = new ArrayList<>();
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
                    List<String> matriculas = (List<String>) servicio.mostrarMatricula();
                    for(String matricula : matriculas){
                        System.out.println("matricula = " + matricula);
                    }

                    break;

                case 2:
                    List<Object[]> resultados = (List<Object[]>) servicio.mostrarMatriculaYmarca();
                    for(Object[] fila: resultados){
                        System.out.println("matricula: " + fila[0]+", marca: "+fila[1]);
                    }
                    break;
                    
                case 3:
                    List<String> matricula = (List<String>) servicio.masDosAsientosYruedas();
                    for(String m : matricula){
                        System.out.println("matricula = " + matricula);
                    }
                    break;


                case 4:
                    List<String> result = (List<String>) servicio.case4();
                    System.out.println("result = " + result);

                    break;

                case 5:
                    List<String> result2 = (List<String>) servicio.case5();
                    System.out.println("result = " + result2);

                    break;



                case 6:
                List<Object[]> result3 = servicio.case6();
                    for (Object[] row : result3) {
                        System.out.println("Matricula: " + row[0] + ", Pérdida: " + row[1]);
                    }

                break;

            }
        }while(opcion !=5);

    }
}