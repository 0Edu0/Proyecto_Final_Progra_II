package com.mycompany.proyecto_final;
import java.util.ArrayList;
import java.util.Scanner;

public class Proyecto_Final {

    private Scanner scanner = new Scanner(System.in);
    private boolean salir = false;
    private ArrayList<PokemonCombate> equipoUsuario = new ArrayList<>();
    private ArrayList<PokemonCombate> equipoComputadora = new ArrayList<>();

    public static void main(String[] args) {
        ConexionDB conec = new ConexionDB();
        conec.estableceConexion();

        Proyecto_Final proyecto = new Proyecto_Final();
        proyecto.MenuPokemon();
    }

    // Menu principal
    public void MenuPokemon() {
        while (!salir) {
            System.out.println("Ingrese una opción: ");
            System.out.println("1. Ver Pokedex");
            System.out.println("2. Combate");

            int opcion1 = scanner.nextInt();
            scanner.nextLine();

            switch (opcion1) {
                case 1:
                    menuPokedex();
                    break;
                case 2:
                    menuPrincipalCombate();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    // Menu para la Pokedex
    public void menuPokedex() {
        while (!salir) {
<<<<<<< HEAD
              System.out.println("Ingrese una opción:");
                System.out.println("1. Ver pokemones normales");
                System.out.println("2. Ver pokemones de Agua");
                System.out.println("3. Ver pokemones de Fuego");
                System.out.println("4. Ver pokemones de Planta");
                System.out.println("5. Ver pokemones eléctricos");
                System.out.println("6. Ver pokemones de Hielo");
                System.out.println("7. Ver todos los pokemones");

                System.out.println("8. Salir");
=======
            System.out.println("Ingrese una opción:");
            System.out.println("1. Ver pokemones normales");
            System.out.println("2. Ver pokemones de Agua");
            System.out.println("3. Ver pokemones de Fuego");
            System.out.println("4. Ver pokemones de Planta");
            System.out.println("5. Ver pokemones eléctricos");
            System.out.println("6. Ver pokemones de Hielo");
            System.out.println("7. Mostrar todos");
            System.out.println("8. Salir");
>>>>>>> 157b37f2c87b5d046569494b1cd7c44e0f1ff5d3

            int opcion = scanner.nextInt();
            scanner.nextLine();

            TipoPokemon tipoPokemon = new TipoPokemon();
            Pokedex pokedex = new Pokedex();
<<<<<<< HEAD
           
            
=======

>>>>>>> 157b37f2c87b5d046569494b1cd7c44e0f1ff5d3
            switch (opcion) {
                case 1:
                    tipoPokemon.getPokemonesNormales();
                    break;
                case 2:
                    tipoPokemon.getPokemonesDeAgua();
                    break;
                case 3:
                    tipoPokemon.getPokemonesDeFuego();
                    break;
                case 4:
                    tipoPokemon.getPokemonesDePlanta();
                    break;
                case 5:
                    tipoPokemon.getPokemonesDeElectrico();
                    break;
                case 6:
                    tipoPokemon.getPokemonesDeHielo();
                    break;
<<<<<<< HEAD
                    
                  case 7:
                    pokedex.getTodosPokemones();
                    break;
                    
                   case 8:
                   salir = true;
=======
                case 7:
                    pokedex.getTodosLosPokemon();
                    break;
                case 8:
                    salir = true;
>>>>>>> 157b37f2c87b5d046569494b1cd7c44e0f1ff5d3
                    break;
                default:
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
            }
        }
        System.out.println("Programa terminado.");
    }

    public void menuPrincipalCombate() {
        System.out.println("Ingrese una opción:");
        System.out.println("1. Ver Pokémon disponibles para combate.");

        int opcion1 = scanner.nextInt();
        scanner.nextLine();

        switch (opcion1) {
            case 1:
                menuPokemonDisponiblesCombate();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public void menuPokemonDisponiblesCombate() {
        System.out.println("1. Ver Pokémon tipo agua.");
        System.out.println("8. Regresar a menú principal");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                seleccionarPokemonAgua(equipoUsuario, scanner);
                break;
            case 8:
                MenuPokemon();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private void seleccionarPokemonAgua(ArrayList<PokemonCombate> equipoUsuario, Scanner scanner) {
        ArrayList<PokemonCombate> pokemonAgua = PokemonCombateAgua.obtenerPokemonAgua();

        while(equipoUsuario.size() < 3){
            System.out.println("Seleccione un Pokémon tipo agua:");
            for (int i = 0; i < pokemonAgua.size(); i++) {
                System.out.println((i + 1) + " " + pokemonAgua.get(i).getNombre());
            }

            int seleccion = scanner.nextInt();
            scanner.nextLine();

            if (seleccion > 0 && seleccion <= pokemonAgua.size()) {
                PokemonCombate pokemonSeleccionado = pokemonAgua.get(seleccion - 1);
                equipoUsuario.add(pokemonSeleccionado);
                System.out.println("Has seleccionado a " + pokemonSeleccionado.getNombre());
            } else {
                System.out.println("Selección no válida.");
            }
        }
        iniciarCombate();
    }

    private void seleccionarEquipoComputadora(ArrayList<PokemonCombate> equipoComputadora, ArrayList<PokemonCombate> equipoUsuario) {
        ArrayList<PokemonCombate> pokemonDisponibles = PokemonCombateAgua.obtenerPokemonAgua();

        pokemonDisponibles.removeAll(equipoUsuario);

        while (equipoComputadora.size() < 3) {
            int indiceAleatorio = (int) (Math.random() * pokemonDisponibles.size());
            equipoComputadora.add(pokemonDisponibles.remove(indiceAleatorio));
        }
        System.out.println("La computadora ha seleccionado a sus Pokémon.");
    }

    private void iniciarCombate() {
        seleccionarEquipoComputadora(equipoComputadora, equipoUsuario);
        Combate combate = new Combate(equipoUsuario, equipoComputadora);
        combate.iniciarCombate(scanner);
    }
}