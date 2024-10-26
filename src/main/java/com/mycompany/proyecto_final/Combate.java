package com.mycompany.proyecto_final;

import java.util.Scanner;

public class Combate {
    private Entrenador jugador1;
    private Entrenador jugador2;
    private Scanner scanner;

    public Combate(Entrenador jugador1, Entrenador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.scanner = new Scanner(System.in);
    }

    public void iniciarCombate() {
        System.out.println("El combate ha comenzado entre " + jugador1.getNombre() + " y " + jugador2.getNombre());

        while (jugador1.tienePokemonVivos() && jugador2.tienePokemonVivos()) {
            // Turno del Jugador 1
            realizarTurno(jugador1, jugador2);

            // Si el jugador 2 no tiene Pokémon vivos, termina el combate
            if (!jugador2.tienePokemonVivos()) {
                System.out.println(jugador2.getNombre() + " se ha quedado sin Pokémon. ¡" + jugador1.getNombre() + " gana el combate!");
                jugador1.incrementarCombatesGanados();
                verificarEvolucion(jugador1);
                break;
            }

            // Turno del Jugador 2 o la computadora
            realizarTurno(jugador2, jugador1);

            // Si el jugador 1 no tiene Pokémon vivos, termina el combate
            if (!jugador1.tienePokemonVivos()) {
                System.out.println(jugador1.getNombre() + " se ha quedado sin Pokémon. ¡" + jugador2.getNombre() + " gana el combate!");
                jugador2.incrementarCombatesGanados();
                verificarEvolucion(jugador2);
                break;
            }
        }
    }

    private void realizarTurno(Entrenador atacante, Entrenador defensor) {
        PokemonCombate pokemonAtacante = atacante.seleccionarPokemonActivo();
        PokemonCombate pokemonDefensor = defensor.seleccionarPokemonActivo();

        if (pokemonAtacante == null || pokemonDefensor == null) {
            return; // Si no hay Pokémon, el combate termina
        }

        System.out.println(atacante.getNombre() + " ataca con " + pokemonAtacante.getNombre());

        // Mostrar opciones de ataque
        if (!atacante.esComputadora()) {
            System.out.println("Elige un ataque para " + pokemonAtacante.getNombre() + ":");
            pokemonAtacante.mostrarMovimientos();
            int opcionMovimiento = scanner.nextInt();
            scanner.nextLine();

            if (opcionMovimiento < 1 || opcionMovimiento > pokemonAtacante.getMovimientos().size()) {
                System.out.println("Movimiento no válido. Pierdes el turno.");
                return;
            }

            Movimiento ataqueSeleccionado = pokemonAtacante.getMovimientos().get(opcionMovimiento - 1);
            ejecutarAtaque(pokemonAtacante, pokemonDefensor, ataqueSeleccionado);
        } else {
            // Turno de la computadora: elige un ataque aleatoriamente
            Movimiento ataqueSeleccionado = pokemonAtacante.getMovimientos().get((int) (Math.random() * pokemonAtacante.getMovimientos().size()));
            ejecutarAtaque(pokemonAtacante, pokemonDefensor, ataqueSeleccionado);
        }

        // Mostrar estado del Pokémon defensor después del ataque
        if (pokemonDefensor.getHp() <= 0) {
            System.out.println(pokemonDefensor.getNombre() + " ha sido derrotado.");
        } else {
            System.out.println(pokemonDefensor.getNombre() + " tiene " + pokemonDefensor.getHp() + " HP restante.");
        }
    }

    private void ejecutarAtaque(PokemonCombate atacante, PokemonCombate defensor, Movimiento ataqueSeleccionado) {
        System.out.println(atacante.getNombre() + " usa " + ataqueSeleccionado.getNombre() + "!");
        defensor.recibirDanio(ataqueSeleccionado.getPoder());
    }
    
    private void verificarEvolucion(Entrenador entrenador) {
        for (PokemonCombate pokemon : entrenador.getEquipo()) {
            if (pokemon.obtenerCombatesGanadosDesdeDB() >= 1) {
                System.out.println(pokemon.getNombre() + " está evolucionando!");
                pokemon.evolucionar();
            }
        }
    }
}