package lab4p2_equipo12;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_Equipo12 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<Entrenador> listaEntrenadores = new ArrayList();
        do {
            System.out.println("----------Menu----------\n"
                    + "1.Registrar Entrenador\n"
                    + "2.Battle Factory\n"
                    + "3.Capturar/Entrenar\n"
                    + "4.Añadir Movimiento\n"
                    + "5.Salir");
            opcion = read.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del entrenador: ");
                    read.nextLine();
                    String nombre = read.nextLine();
                    read = new Scanner(System.in);
                    System.out.println("Ingrese la edad del entrenador: ");
                    int edad = read.nextInt();
                    System.out.println("Ingrese la cantidad de dinero del entrenador: ");
                    int dinero = read.nextInt();
                    listaEntrenadores.add(new Entrenador(nombre, edad, dinero));
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    opcion = 5;
                    break;
                default :
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);
    }

}
