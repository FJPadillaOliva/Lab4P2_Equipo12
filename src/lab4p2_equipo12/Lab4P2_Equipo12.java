package lab4p2_equipo12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab4P2_Equipo12 {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<Entrenador> listaEntrenadores = new ArrayList();
        ArrayList<Movimiento> listaMovimientos = new ArrayList();
        do {
            System.out.println("----------Menu----------\n"
                    + "1.Registrar Entrenador\n"
                    + "2.Battle Factory\n"
                    + "3.Capturar/Entrenar\n"
                    + "4.Añadir Movimiento\n"
                    + "5.Salir");
            opcion = read.nextInt();
            switch (opcion) {
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
                    System.out.println("Entrenador agregado con exito");
                    break;
                case 2:

                    break;
                case 3:
                    imprimirEntrenadores(listaEntrenadores);
                    int indiceE = read.nextInt();
                    if (indiceE >= 0 && indiceE < listaEntrenadores.size()) {
                        System.out.println("Que desea realizar(1.Capturar/2.Entrenar)");
                        int opcion2 = read.nextInt();
                        switch (opcion2) {
                            case 1:
                                if (listaMovimientos.size() >= 4) {
                                    System.out.println("Ingrese la especie del Pokemon: ");
                                    String especie = read.next();
                                    System.out.println("Ingrese el nivel del Pokemon: ");
                                    int nivel = read.nextInt();
                                    System.out.println("Ingrese la cantidad de puntos de experiencia acuulados: ");
                                    int expAcumulada = read.nextInt();
                                    System.out.println("Ingrese la cantidad de puntos necesarios para subir de nivel: ");
                                    int expToLevelUp = read.nextInt();
                                    System.out.println("Ingrese la cantidad de HP del Pokemon: ");
                                    int hp = read.nextInt();
                                    System.out.println("Ingrese la cantidad de ATK del Pokemon: ");
                                    int atk = read.nextInt();
                                    System.out.println("Ingrese la cantidad de DEF del Pokemon: ");
                                    int def = read.nextInt();
                                    System.out.println("Ingrese la cantidad de SP del Pokemon: ");
                                    int sp = read.nextInt();
                                    System.out.println("Ingrese la cantidad de SPD del Pokemon: ");
                                    int spe = read.nextInt();
                                    System.out.println("Elija los movimientos para su Pokemon: ");
                                    imprimirMovimientos(listaMovimientos);
                                    Movimiento[] listaM = new Movimiento[6];
                                    for (int i = 0; i <= 3; i++) {
                                        System.out.println("Seleccione el movimiento a agregar: ");
                                        int opcion3 = read.nextInt();
                                        while (opcion3 < 0 && opcion3 >= listaMovimientos.size()) {
                                            System.out.println("No valido, ingrese de nuevo el moviento a agregar: ");
                                            opcion3 = read.nextInt();
                                        }
                                        listaM[i] = listaMovimientos.get(opcion3);
                                        System.out.println("Movimiento agregado");
                                    }
                                    if (listaEntrenadores.get(indiceE).getEquipo().size() < 6) {
                                        listaEntrenadores.get(indiceE).getEquipo().add(new Pokemon(especie, nivel, expAcumulada, expToLevelUp, hp, atk, def, sp, spe, "Neutral", listaM));
                                        System.out.println("Pokemon agregado a tu equipo");
                                    } else {
                                        listaEntrenadores.get(indiceE).getCaja().add(new Pokemon(especie, nivel, expAcumulada, expToLevelUp, hp, atk, def, sp, spe, "Neutral", listaM));
                                        System.out.println("Pokemon agregado a tu caja");
                                    }
                                } else {
                                    System.out.println("La lista de movimientos debe contener un minimo de 4 movimientos para crear un Pokemon");
                                }
                                break;
                            case 2:
                                if (listaEntrenadores.get(indiceE).getEquipo().size() != 0) {
                                    System.out.println("De que lista de pokemons desea entrenar(1.Equipo/2.Caja): ");
                                    int opcion3 = read.nextInt();
                                    Random random = new Random();
                                    switch(opcion3){
                                        case 1:
                                            System.out.println("-------------Lista de Equipo-------------");
                                            imprimirPokemones(listaEntrenadores.get(indiceE).getEquipo());
                                            int indiceP = read.nextInt();
                                            if (indiceP >= 0 && indiceP < listaEntrenadores.get(indiceE).getEquipo().size()) {
                                                int expActual = listaEntrenadores.get(indiceE).getEquipo().get(indiceP).getExpAcumulada();
                                                int r1 = random.nextInt(2);
                                                int r2 = 100 + random.nextInt(4999);
                                                listaEntrenadores.get(indiceE).getEquipo().get(indiceP).setExpAcumulada(expActual+(r1*r2));
                                                System.out.println("Su Pokemon obtuvo "+expActual+(r1*r2)+" pts de experiencia en esta sesion de entrenamiento");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("-------------Lista de Caja-------------");
                                            imprimirPokemones(listaEntrenadores.get(indiceE).getCaja());
                                            indiceP = read.nextInt();
                                            if (indiceP >= 0 && indiceP < listaEntrenadores.get(indiceE).getCaja().size()) {
                                                int expActual = listaEntrenadores.get(indiceE).getEquipo().get(indiceP).getExpAcumulada();
                                                int r1 = random.nextInt(2);
                                                int r2 = 100 + random.nextInt(4999);
                                                listaEntrenadores.get(indiceE).getCaja().get(indiceP).setExpAcumulada(expActual+(r1*r2));
                                                System.out.println("Su Pokemon obtuvo "+expActual+(r1*r2)+" pts de experiencia en esta sesion de entrenamiento");
                                            }
                                            break;
                                        default:
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                    
                                } else {
                                    System.out.println("Su equipo esta vacio");
                                }
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    } else {
                        System.out.println("Fuera de rango");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del movimiento: ");
                    read.nextLine();
                    String nombreM = read.nextLine();
                    read = new Scanner(System.in);
                    System.out.println("Ingrese una descripcion breve del ataque: ");
                    read.nextLine();
                    String desc = read.nextLine();
                    read = new Scanner(System.in);
                    System.out.println("Ingrese el tipo del ataque(1.Estado/2.Fisico/3.Especial)");
                    int tipo = read.nextInt();
                    while (tipo < 1 || tipo > 3) {
                        System.out.println("No valido, vuelva a ingresar el tipo");
                    }
                    switch (tipo) {
                        case 1:
                            String problemaEstado  = "";
                            System.out.println("Ingrese el problema de estado(1.Cansancio/2.Envenenamiento/3.Paralisis/4.Quemadura)");
                            int tipoE = read.nextInt();
                            while (tipoE < 1 || tipo > 4) {
                                System.out.println("No valido, vuelva a ingresar el tipo");
                            }
                            if (tipoE == 1) {
                                problemaEstado = "Dormido";
                            } else if (tipoE == 2) {
                                problemaEstado = "Envenenado";
                            } else if (tipoE == 3) {
                                problemaEstado = "Paralizado";
                            } else if (tipoE == 4) {
                                problemaEstado = "Quemado";
                            }
                            listaMovimientos.add(new AtaqueEstado(problemaEstado, nombreM, desc));
                            JOptionPane.showMessageDialog(null, "Movimiento agregado exitosamente");
                            break;
                        case 2:
                            System.out.println("Ingrese los puntos de poder: ");
                            int puntosPoder = read.nextInt();
                            System.out.println("Ingrese los puntos de precision: ");
                            int puntosPrecision = read.nextInt();
                            listaMovimientos.add(new AtaqueFisico(puntosPoder, puntosPrecision, nombreM, desc));
                            JOptionPane.showMessageDialog(null, "Movimiento agregado exitosamente");
                            break;
                        case 3:
                            System.out.println("Ingrese los puntos de poder: ");
                            puntosPoder = read.nextInt();
                            System.out.println("Ingrese los puntos de precision: ");
                            puntosPrecision = read.nextInt();
                            listaMovimientos.add(new AtaqueEspecial(puntosPoder, puntosPrecision, nombreM, desc));
                            JOptionPane.showMessageDialog(null, "Movimiento agregado exitosamente");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 5:
                    opcion = 5;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);
    }

    public static void imprimirEntrenadores(ArrayList<Entrenador> listaEntrenadores) {
        String lista = "";
        for (Entrenador t : listaEntrenadores) {
            lista += listaEntrenadores.indexOf(t) + ".-" + t + "\n";
        }
        System.out.println(lista);
    }

    public static void imprimirMovimientos(ArrayList<Movimiento> listaMovimientos) {
        String lista = "";
        for (Movimiento t : listaMovimientos) {
            lista += listaMovimientos.indexOf(t) + ".-" + t + "\n";
        }
        System.out.println(lista);
    }
    
    public static void imprimirPokemones(ArrayList<Pokemon> listaPokemones){
        String lista = "";
        for (Pokemon t : listaPokemones) {
            lista += listaPokemones.indexOf(t) + ".-" + t + "\n";
        }
        System.out.println(lista);
    }
}
