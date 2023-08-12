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
                    Entrenador entrenador1;
                    Entrenador entrenador2;
                    Pokemon pokemon1 = new Pokemon();
                    Pokemon pokemon2 = new Pokemon();
                    imprimirEntrenadores(listaEntrenadores);
                    System.out.println("Elija el primer entrenador: ");
                    int e1 = read.nextInt();
                    if (e1 >= 0 && e1 < listaEntrenadores.size()) {
                        entrenador1 = listaEntrenadores.get(e1);
                    } else {
                        System.out.println("Fuera de rango");
                        break;
                    }
                    System.out.println("Elija el segundo entrenador: ");
                    int e2 = read.nextInt();
                    if (e2 >= 0 && e2 < listaEntrenadores.size()) {
                        entrenador2 = listaEntrenadores.get(e2);
                    } else if (e2 == e1) {
                        System.out.println("No puede elegir el mismo entrenador");
                        break;
                    } else {
                        System.out.println("Fuera de rango");
                        break;
                    }
                    imprimirEquipo(entrenador1);
                    System.out.println("Elija el Pokemon para el primer entrenador: ");
                    int p1 = read.nextInt();
                    if (p1 >= 0 && p1 < entrenador1.getEquipo().size()) {
                        pokemon1 = entrenador1.getEquipo().get(p1);
                    } else {
                        System.out.println("Fuera de rango");
                    }
                    imprimirEquipo(entrenador2);
                    System.out.println("Elija el Pokemon para el segundo entrenador: ");
                    int p2 = read.nextInt();
                    if (p2 >= 0 && p2 < entrenador1.getEquipo().size()) {
                        pokemon2 = entrenador2.getEquipo().get(p2);
                    } else {
                        System.out.println("Fuera de rango");
                    }
                    while (pokemon1.getHp() > 0 || pokemon2.getHp() > 0) {
                        if (pokemon1.getSpe() >= pokemon2.getSpe()) {
                            imprimirMovimientos(pokemon1.getListaMovimientos());
                            int m1 = read.nextInt();
                            while (m1 < 0 || m1 >= 4) {
                                System.out.println("Movimiento no valido, ingreselo de nuevo: ");
                                m1 = read.nextInt();
                            }
                            if (pokemon1.getListaMovimientos()[m1] instanceof AtaqueEstado) {
                                System.out.println(pokemon1.getEspecie() + "ha inflingido "
                                        + ((AtaqueEstado) pokemon1.getListaMovimientos()[m1]).getProblemaEstado() + " a " + pokemon2.getEspecie());
                                pokemon1.getListaMovimientos()[m1].ataque(pokemon1, pokemon2);
                            } else if (pokemon1.getListaMovimientos()[m1] instanceof AtaqueFisico) {
                                System.out.println(pokemon1.getEspecie() + " ha inflingido "
                                        + pokemon1.getListaMovimientos()[m1].ataque(pokemon1, pokemon2) + " a " + pokemon2.getEspecie());
                            } else if (pokemon1.getListaMovimientos()[m1] instanceof AtaqueEspecial) {
                                System.out.println(pokemon1.getEspecie() + " ha inflingido "
                                        + pokemon1.getListaMovimientos()[m1].ataque(pokemon1, pokemon2) + " a " + pokemon2.getEspecie());
                            }

                            imprimirMovimientos(pokemon2.getListaMovimientos());
                            int m2 = read.nextInt();
                            while (m2 < 0 || m2 >= 4) {
                                System.out.println("Movimiento no valido, ingreselo de nuevo: ");
                                m2 = read.nextInt();
                            }
                            if (pokemon2.getListaMovimientos()[m2] instanceof AtaqueEstado) {
                                System.out.println(pokemon2.getEspecie() + " ha inflingido "
                                        + ((AtaqueEstado) pokemon2.getListaMovimientos()[m2]).getProblemaEstado() + " a " + pokemon1.getEspecie());
                                pokemon2.getListaMovimientos()[m2].ataque(pokemon2, pokemon1);
                            } else if (pokemon1.getListaMovimientos()[m2] instanceof AtaqueFisico) {
                                System.out.println(pokemon2.getEspecie() + " ha inflingido "
                                        + pokemon2.getListaMovimientos()[m2].ataque(pokemon2, pokemon1) + " a " + pokemon1.getEspecie());
                            } else if (pokemon1.getListaMovimientos()[m2] instanceof AtaqueEspecial) {
                                System.out.println(pokemon2.getEspecie() + " ha inflingido "
                                        + pokemon2.getListaMovimientos()[m2].ataque(pokemon2, pokemon1) + " a " + pokemon1.getEspecie());
                            }
                        } else if (pokemon2.getSpe() >= pokemon1.getSpe()) {
                            imprimirMovimientos(pokemon2.getListaMovimientos());
                            int m2 = read.nextInt();
                            while (m2 < 0 || m2 >= 4) {
                                System.out.println("Movimiento no valido, ingreselo de nuevo: ");
                                m2 = read.nextInt();
                            }
                            if (pokemon2.getListaMovimientos()[m2] instanceof AtaqueEstado) {
                                System.out.println(pokemon2.getEspecie() + " ha inflingido "
                                        + ((AtaqueEstado) pokemon2.getListaMovimientos()[m2]).getProblemaEstado() + " a " + pokemon1.getEspecie());
                                pokemon2.getListaMovimientos()[m2].ataque(pokemon2, pokemon1);
                            } else if (pokemon1.getListaMovimientos()[m2] instanceof AtaqueFisico) {
                                System.out.println(pokemon2.getEspecie() + " ha inflingido "
                                        + pokemon2.getListaMovimientos()[m2].ataque(pokemon2, pokemon1) + " a " + pokemon1.getEspecie());
                            } else if (pokemon1.getListaMovimientos()[m2] instanceof AtaqueEspecial) {
                                System.out.println(pokemon2.getEspecie() + " ha inflingido "
                                        + pokemon2.getListaMovimientos()[m2].ataque(pokemon2, pokemon1) + " a " + pokemon1.getEspecie());
                            }

                            imprimirMovimientos(pokemon1.getListaMovimientos());
                            int m1 = read.nextInt();
                            while (m1 < 0 || m1 >= 4) {
                                System.out.println("Movimiento no valido, ingreselo de nuevo: ");
                                m1 = read.nextInt();
                            }
                            if (pokemon1.getListaMovimientos()[m1] instanceof AtaqueEstado) {
                                System.out.println(pokemon1.getEspecie() + " ha inflingido "
                                        + ((AtaqueEstado) pokemon1.getListaMovimientos()[m1]).getProblemaEstado() + " a " + pokemon2.getEspecie());
                                pokemon1.getListaMovimientos()[m1].ataque(pokemon1, pokemon2);
                            } else if (pokemon1.getListaMovimientos()[m1] instanceof AtaqueFisico) {
                                System.out.println(pokemon1.getEspecie() + " ha inflingido "
                                        + pokemon1.getListaMovimientos()[m1].ataque(pokemon1, pokemon2) + " a " + pokemon2.getEspecie());
                            } else if (pokemon1.getListaMovimientos()[m1] instanceof AtaqueEspecial) {
                                System.out.println(pokemon1.getEspecie() + " ha inflingido "
                                        + pokemon1.getListaMovimientos()[m1].ataque(pokemon1, pokemon2) + " a " + pokemon2.getEspecie());
                            }
                        }
                    }
                    if (pokemon1.getHp() <= 0) {
                        System.out.println("El ganador es : " + pokemon2.getEspecie());
                    }else{
                        System.out.println("El ganador es : " + pokemon1.getEspecie());
                    }
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
                                    System.out.println("Ingrese la cantidad de puntos de experiencia acumulados: ");
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
                                    switch (opcion3) {
                                        case 1:
                                            System.out.println("-------------Lista de Equipo-------------");
                                            imprimirPokemones(listaEntrenadores.get(indiceE).getEquipo());
                                            int indiceP = read.nextInt();
                                            if (indiceP >= 0 && indiceP < listaEntrenadores.get(indiceE).getEquipo().size()) {
                                                int expActual = listaEntrenadores.get(indiceE).getEquipo().get(indiceP).getExpAcumulada();
                                                int r1 = random.nextInt(2);
                                                int r2 = 100 + random.nextInt(4999);
                                                listaEntrenadores.get(indiceE).getEquipo().get(indiceP).setExpAcumulada(expActual + (r1 * r2));
                                                System.out.println("Su Pokemon obtuvo " + expActual + (r1 * r2) + " pts de experiencia en esta sesion de entrenamiento");
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
                                                listaEntrenadores.get(indiceE).getCaja().get(indiceP).setExpAcumulada(expActual + (r1 * r2));
                                                System.out.println("Su Pokemon obtuvo " + expActual + (r1 * r2) + " pts de experiencia en esta sesion de entrenamiento");
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
                    String desc = read.nextLine();
                    read = new Scanner(System.in);
                    System.out.println("Ingrese el tipo del ataque(1.Estado/2.Fisico/3.Especial)");
                    int tipo = read.nextInt();
                    while (tipo < 1 || tipo > 3) {
                        System.out.println("No valido, vuelva a ingresar el tipo");
                    }
                    switch (tipo) {
                        case 1:
                            String problemaEstado = "";
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
                            System.out.println("Movimiento agregado con exito");
                            break;
                        case 2:
                            System.out.println("Ingrese los puntos de poder: ");
                            int puntosPoder = read.nextInt();
                            System.out.println("Ingrese los puntos de precision: ");
                            int puntosPrecision = read.nextInt();
                            listaMovimientos.add(new AtaqueFisico(puntosPoder, puntosPrecision, nombreM, desc));
                            System.out.println("Movimiento agregado con exito");
                            break;
                        case 3:
                            System.out.println("Ingrese los puntos de poder: ");
                            puntosPoder = read.nextInt();
                            System.out.println("Ingrese los puntos de precision: ");
                            puntosPrecision = read.nextInt();
                            listaMovimientos.add(new AtaqueEspecial(puntosPoder, puntosPrecision, nombreM, desc));
                            System.out.println("Movimiento agregado con exito");
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

    public static void imprimirPokemones(ArrayList<Pokemon> listaPokemones) {
        String lista = "";
        for (Pokemon t : listaPokemones) {
            lista += listaPokemones.indexOf(t) + ".-" + t + "\n";
        }
        System.out.println(lista);
    }

    public static void imprimirEquipo(Entrenador entrenador) {
        String lista = "";
        ArrayList<Pokemon> equipo = entrenador.getEquipo();
        for (Pokemon t : equipo) {
            lista += equipo.indexOf(t) + ".-" + t + "\n";
        }
        System.out.println(lista);
    }

    public static void imprimirMovimientos(Movimiento[] listaM) {
        String lista = "";
        for (int i = 0; i <= 3; i++) {
            lista += i + ".-" + listaM[i] + "\n";
        }
        System.out.println(lista);
    }
}
