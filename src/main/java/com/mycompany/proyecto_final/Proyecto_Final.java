package com.mycompany.proyecto_final;

import java.util.Scanner;

public class Proyecto_Final {

    private Scanner scanner = new Scanner(System.in);
    private boolean salir = false;
    private Entrenador entrenadorJugador;
    private Entrenador entrenadorComputadora;
    private PokemonService pokemonService = new PokemonService();

    public static void main(String[] args) {
        Proyecto_Final proyecto = new Proyecto_Final();
        proyecto.menuPrincipal();
    }

    public void menuPrincipal() {
        while (!salir) {
            System.out.println("Ingrese una opción: ");
            System.out.println("1. Pokedex");
            System.out.println("2. Combate");
            System.out.println("3. Inventario de Piedras");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    menuPokedex();
                    break;
                case 2:
                    menuCombate();
                    break;
                case 3:
                    menuPiedras();
                    break;
                case 4:
                    salir = true;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    // Menú Pokedex
    public void menuPokedex() {
        Pokedex pokedex = new Pokedex();
        pokedex.mostrarPokedex();
    }

    // Menú Combate
    public void menuCombate() {
        System.out.println("Selecciona el modo de combate:");
        System.out.println("1. Contra la computadora");
        System.out.println("2. Contra otro jugador");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                iniciarCombateComputadora();
                break;
            case 2:
                iniciarCombateJugadorVsJugador();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    
    //Menu para evolucion con piedras
    public void menuPiedras() {
        System.out.println("Selecciona el tipo de Pokemon que quieras evolucionar.");
        System.out.println("1. Tipo agua");
        System.out.println("2. Tipo eléctrico");
        System.out.println("3. Tipo fuego");
        System.out.println("4. Tipo hielo");
        System.out.println("5. Tipo normal");
        System.out.println("6. Tipo planta");
        
        int opcionPiedra = scanner.nextInt();
        scanner.nextLine();
        
        String tipoPiedra = "";
        switch (opcionPiedra) {
            case 1:
                tipoPiedra = "Piedra Agua";
                break;
            case 2:
                tipoPiedra = "Piedra Trueno";
                break;
            case 3:
                tipoPiedra = "Piedra Fuego";
                break;
            case 4:
                tipoPiedra = "Piedra Hielo";
                break;
            case 5:
                tipoPiedra = "Piedra Hoja";
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }
        
        System.out.println("Introduce el nombre del Pokémon que quieres evolucionar:");
        String nombrePokemon = scanner.nextLine();

        pokemonService.evolucionarConPiedra(tipoPiedra, nombrePokemon);
    }

    // Combate contra la computadora
    private void iniciarCombateComputadora() {
        System.out.println("Iniciando combate contra la computadora...");
        entrenadorJugador = new Entrenador("Jugador 1", false);
        entrenadorComputadora = new Entrenador("Computadora", true);

        entrenadorJugador.seleccionarEquipo(scanner);
        entrenadorComputadora.seleccionarEquipoAleatorio();  // La computadora selecciona su equipo aleatorio

        Combate combate = new Combate(entrenadorJugador, entrenadorComputadora);
        combate.iniciarCombate();
    }

    // Combate jugador vs jugador
    private void iniciarCombateJugadorVsJugador() {
        System.out.println("Iniciando combate entre dos jugadores...");

        entrenadorJugador = new Entrenador("Jugador 1", false);
        Entrenador entrenadorJugador2 = new Entrenador("Jugador 2", false);

        entrenadorJugador.seleccionarEquipo(scanner);
        entrenadorJugador2.seleccionarEquipo(scanner);

        Combate combate = new Combate(entrenadorJugador, entrenadorJugador2);
        combate.iniciarCombate();
    }
}
