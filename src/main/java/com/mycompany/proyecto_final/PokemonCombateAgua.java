/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final;

import java.util.ArrayList;

/**
 *
 * @author eduli
 */
public class PokemonCombateAgua {

    // Método principal para obtener la lista de Pokémon de tipo Agua
    public static ArrayList<PokemonCombate> obtenerPokemonAgua() {
        ArrayList<PokemonCombate> listaPokemonAgua = new ArrayList<>();

        // Añadir Pokémon a la lista
        listaPokemonAgua.add(crearSquirtle());
        listaPokemonAgua.add(crearWartortle());
        listaPokemonAgua.add(crearBlastoise());
        listaPokemonAgua.add(crearPsyduck());
        listaPokemonAgua.add(crearGolduck());
        listaPokemonAgua.add(crearPoliwag());
        listaPokemonAgua.add(crearPoliwhirl());
        listaPokemonAgua.add(crearPoliwrath());
        listaPokemonAgua.add(crearTentacool());
        listaPokemonAgua.add(crearTentacruel());
        listaPokemonAgua.add(crearSlowpoke());
        listaPokemonAgua.add(crearSlowbro());
        listaPokemonAgua.add(crearSeel());
        listaPokemonAgua.add(crearDewgong());
        listaPokemonAgua.add(crearShellder());
        listaPokemonAgua.add(crearCloyster());
        listaPokemonAgua.add(crearKrabby());
        listaPokemonAgua.add(crearKingler());
        listaPokemonAgua.add(crearHorsea());
        listaPokemonAgua.add(crearSeadra());

        return listaPokemonAgua;
    }

    // Métodos para crear habilidades
    private static Habilidades crearHabilidad(String nombre, String tipo, String descripcion, int pp, int potencia) {
        return new Habilidades(nombre, tipo, descripcion, pp, potencia);
    }

    // Métodos para crear Pokémon
    private static PokemonCombate crearSquirtle() {
        ArrayList<Habilidades> habilidadesSquirtle = new ArrayList<>();
        habilidadesSquirtle.add(crearHabilidad("Pistola Agua", "Agua", "Lanza un chorro de agua que inflige daño a los Pokémon rivales a los que golpea.", 25, 5));
        habilidadesSquirtle.add(crearHabilidad("Hidropulso", "Agua", "Lanza un pulso de agua hacia el oponente, con una alta probabilidad de confundirlo.", 20, 60));
        habilidadesSquirtle.add(crearHabilidad("Placaje", "Normal", "No tiene efectos secundarios; simplemente inflige daño al oponente.", 35, 40));
        habilidadesSquirtle.add(crearHabilidad("Mordisco", "Siniestro", "El usuario muerde al oponente con colmillos afilados, y tiene una probabilidad de hacer que el objetivo retroceda.", 25, 60));

        return new PokemonCombate("Squirtle", "Masculino", 44, 200, 1, 0, habilidadesSquirtle, "Pokémon de tipo Agua. Fuerte defensa.");
    }

    private static PokemonCombate crearWartortle() {
        ArrayList<Habilidades> habilidadesWartortle = new ArrayList<>();
        habilidadesWartortle.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesWartortle.add(crearHabilidad("Surf", "Agua", "Genera una ola grande que golpea a todos los Pokémon rivales.", 15, 90));
        habilidadesWartortle.add(crearHabilidad("Rayo Hielo", "Hielo", "Lanza un rayo de energía helada hacia el oponente, con una probabilidad del 10% de congelarlo.", 10, 90));
        habilidadesWartortle.add(crearHabilidad("Mordisco", "Siniestro", "El usuario muerde al oponente con colmillos afilados, y tiene una probabilidad de hacer que el objetivo retroceda.", 25, 60));

        return new PokemonCombate("Wartortle", "Masculino", 59, 200, 16, 0, habilidadesWartortle, "Wartortle, el Pokémon Tortuga, es la evolución de Squirtle. Se caracteriza por su caparazón azul y sus orejas de forma triangular. Tiene una cola en forma de espiral que utiliza para nadar con agilidad. Es conocido por su habilidad para lanzar chorros de agua a alta presión y por su actitud algo orgullosa.");
    }

    private static PokemonCombate crearBlastoise() {
        ArrayList<Habilidades> habilidadesBlastoise = new ArrayList<>();
        habilidadesBlastoise.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesBlastoise.add(crearHabilidad("Surf", "Agua", "Genera una ola grande que golpea a todos los Pokémon rivales.", 15, 90));
        habilidadesBlastoise.add(crearHabilidad("Rayo Hielo", "Hielo", "Lanza un rayo de energía helada hacia el oponente, con una probabilidad del 10% de congelarlo.", 10, 90));
        habilidadesBlastoise.add(crearHabilidad("Cabezaso", "Normal", "El usuario embiste al oponente con su cabeza, con una probabilidad del 30% de hacer que el objetivo retroceda.", 15, 70));

        return new PokemonCombate("Blastoise", "Masculino", 79, 200, 36, 0, habilidadesBlastoise, "Blastoise es la última evolución de Squirtle y se distingue por su imponente tamaño y su caparazón robusto. Su característica más notable son los cañones de agua situados en sus hombros, que puede utilizar para lanzar potentes chorros de agua.");
    }

    private static PokemonCombate crearPsyduck() {
        ArrayList<Habilidades> habilidadesPsyduck = new ArrayList<>();
        habilidadesPsyduck.add(crearHabilidad("Pistola Agua", "Agua", "Lanza un chorro de agua que inflige daño a los Pokémon rivales a los que golpea.", 25, 100));
        habilidadesPsyduck.add(crearHabilidad("Confusión", "Psíquico", "El usuario ataca al oponente con una onda psíquica, con una probabilidad de confundirlo.", 25, 50));
        habilidadesPsyduck.add(crearHabilidad("Surf", "Agua", "Genera una ola grande que golpea a todos los Pokémon rivales.", 15, 90));
        habilidadesPsyduck.add(crearHabilidad("Psíquico", "Psíquico", "Un ataque psíquico poderoso que puede reducir la Defensa Especial del oponente.", 10, 90));

        return new PokemonCombate("Psyduck", "Femenino", 50, 200, 1, 0, habilidadesPsyduck, "Psyduck es un Pokémon de tipo Agua conocido por su apariencia confusa y su comportamiento errático. Aunque parece distraído y desorientado, Psyduck tiene un potencial psíquico oculto que se libera cuando sus dolores de cabeza se vuelven demasiado intensos.");
    }

    private static PokemonCombate crearGolduck() {
        ArrayList<Habilidades> habilidadesGolduck = new ArrayList<>();
        habilidadesGolduck.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesGolduck.add(crearHabilidad("Pistola Agua", "Agua", "Lanza un chorro de agua que inflige daño a los Pokémon rivales a los que golpea.", 25, 100));
        habilidadesGolduck.add(crearHabilidad("Psíquico", "Psíquico", "Un ataque psíquico poderoso que puede reducir la Defensa Especial del oponente.", 10, 90));
        habilidadesGolduck.add(crearHabilidad("Confusión", "Psíquico", "El usuario ataca al oponente con una onda psíquica, con una probabilidad de confundirlo.", 25, 50));

        return new PokemonCombate("Golduck", "Masculino", 80, 200, 33, 0, habilidadesGolduck, "Golduck es un Pokémon de tipo Agua que es conocido por su velocidad y agilidad en el agua. Tiene una apariencia de pato con una estructura corporal más estilizada que Psyduck, y su habilidad para nadar rápidamente le permite atacar con gran eficacia.");
    }

    private static PokemonCombate crearPoliwag() {
        ArrayList<Habilidades> habilidadesPoliwag = new ArrayList<>();
        habilidadesPoliwag.add(crearHabilidad("Pistola Agua", "Agua", "Lanza un chorro de agua que inflige daño a los Pokémon rivales a los que golpea.", 25, 100));
        habilidadesPoliwag.add(crearHabilidad("Confusión", "Psíquico", "El usuario ataca al oponente con una onda psíquica, con una probabilidad de confundirlo.", 25, 50));
        habilidadesPoliwag.add(crearHabilidad("Golpe Roca", "Roca", "Un golpe poderoso que puede causar daño adicional al oponente.", 10, 50));
        habilidadesPoliwag.add(crearHabilidad("Drenadoras", "Planta", "El usuario drena la energía del oponente y recupera PS.", 10, 50));

        return new PokemonCombate("Poliwag", "Masculino", 40, 200, 1, 0, habilidadesPoliwag, "Poliwag es un Pokémon de tipo Agua que se asemeja a una pequeña rana con un cuerpo redondo y una cola en espiral. Es conocido por su habilidad para nadar con gran rapidez y por su característico vórtice en su estómago.");
    }

    private static PokemonCombate crearPoliwhirl() {
        ArrayList<Habilidades> habilidadesPoliwhirl = new ArrayList<>();
        habilidadesPoliwhirl.add(crearHabilidad("Pistola Agua", "Agua", "Lanza un chorro de agua que inflige daño a los Pokémon rivales a los que golpea.", 25, 100));
        habilidadesPoliwhirl.add(crearHabilidad("Confusión", "Psíquico", "El usuario ataca al oponente con una onda psíquica, con una probabilidad de confundirlo.", 25, 50));
        habilidadesPoliwhirl.add(crearHabilidad("Puño Fuego", "Fuego", "Un puñetazo ardiente que inflige daño al oponente y puede quemarlo.", 15, 75));
        habilidadesPoliwhirl.add(crearHabilidad("Puño Trueno", "Eléctrico", "Un puñetazo eléctrico que inflige daño al oponente y puede paralizarlo.", 15, 75));

        return new PokemonCombate("Poliwhirl", "Masculino", 65, 200, 2, 0, habilidadesPoliwhirl, "Poliwhirl es una evolución de Poliwag y se distingue por sus habilidades mejoradas en el agua. Su cuerpo más musculoso y sus habilidades de lucha lo convierten en un oponente formidable.");
    }

    private static PokemonCombate crearPoliwrath() {
        ArrayList<Habilidades> habilidadesPoliwrath = new ArrayList<>();
        habilidadesPoliwrath.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesPoliwrath.add(crearHabilidad("Puño Fuego", "Fuego", "Un puñetazo ardiente que inflige daño al oponente y puede quemarlo.", 15, 75));
        habilidadesPoliwrath.add(crearHabilidad("Puño Trueno", "Eléctrico", "Un puñetazo eléctrico que inflige daño al oponente y puede paralizarlo.", 15, 75));
        habilidadesPoliwrath.add(crearHabilidad("Puño Hielo", "Hielo", "Un puñetazo helado que inflige daño al oponente y puede congelarlo.", 15, 75));

        return new PokemonCombate("Poliwrath", "Masculino", 90, 200, 5, 0, habilidadesPoliwrath, "Poliwrath es la evolución final de Poliwag, conocida por su cuerpo musculoso y sus habilidades de combate mejoradas. Su habilidad para usar una variedad de ataques lo hace muy versátil en batalla.");
    }

    private static PokemonCombate crearTentacool() {
        ArrayList<Habilidades> habilidadesTentacool = new ArrayList<>();
        habilidadesTentacool.add(crearHabilidad("Puño Agua", "Agua", "Un puñetazo que inflige daño al oponente y puede hacer que se confunda.", 10, 50));
        habilidadesTentacool.add(crearHabilidad("Rayo", "Eléctrico", "Un ataque eléctrico que puede paralizar al oponente.", 15, 50));
        habilidadesTentacool.add(crearHabilidad("Ataque Rápido", "Normal", "Un ataque rápido que siempre ataca primero.", 20, 40));
        habilidadesTentacool.add(crearHabilidad("Bomba Ácida", "Veneno", "Lanza una sustancia ácida que puede reducir la Defensa Especial del oponente.", 15, 40));

        return new PokemonCombate("Tentacool", "Femenino", 40, 200, 5, 0, habilidadesTentacool, "Tentacool es un Pokémon de tipo Agua/Veneno que parece una medusa. Es conocido por sus tentáculos que pueden causar quemaduras o parálisis. Vive en aguas profundas y puede causar problemas a los entrenadores desprevenidos.");
    }

    private static PokemonCombate crearTentacruel() {
        ArrayList<Habilidades> habilidadesTentacruel = new ArrayList<>();
        habilidadesTentacruel.add(crearHabilidad("Bomba Ácida", "Veneno", "Lanza una sustancia ácida que puede reducir la Defensa Especial del oponente.", 15, 40));
        habilidadesTentacruel.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesTentacruel.add(crearHabilidad("Puño Hielo", "Hielo", "Un puñetazo helado que inflige daño al oponente y puede congelarlo.", 15, 75));
        habilidadesTentacruel.add(crearHabilidad("Pulso Agua", "Agua", "Lanza un pulso de agua hacia el oponente, con una alta probabilidad de confundirlo.", 20, 60));

        return new PokemonCombate("Tentacruel", "Masculino", 80, 200, 30, 0, habilidadesTentacruel, "Tentacruel es la evolución de Tentacool y es conocido por su tamaño más grande y sus tentáculos más largos y venenosos. Tiene la capacidad de causar parálisis y dolor con sus ataques venenosos.");
    }

    private static PokemonCombate crearSlowpoke() {
        ArrayList<Habilidades> habilidadesSlowpoke = new ArrayList<>();
        habilidadesSlowpoke.add(crearHabilidad("Pistola Agua", "Agua", "Lanza un chorro de agua que inflige daño a los Pokémon rivales a los que golpea.", 25, 100));
        habilidadesSlowpoke.add(crearHabilidad("Confusión", "Psíquico", "El usuario ataca al oponente con una onda psíquica, con una probabilidad de confundirlo.", 25, 50));
        habilidadesSlowpoke.add(crearHabilidad("Psíquico", "Psíquico", "Un ataque psíquico poderoso que puede reducir la Defensa Especial del oponente.", 10, 90));
        habilidadesSlowpoke.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));

        return new PokemonCombate("Slowpoke", "Femenino", 90, 200, 1, 0, habilidadesSlowpoke, "Slowpoke es conocido por su lento ritmo y su apariencia relajada. Es un Pokémon que puede usar habilidades psíquicas poderosas, a pesar de su apariencia tranquila.");
    }

    private static PokemonCombate crearSlowbro() {
        ArrayList<Habilidades> habilidadesSlowbro = new ArrayList<>();
        habilidadesSlowbro.add(crearHabilidad("Psíquico", "Psíquico", "Un ataque psíquico poderoso que puede reducir la Defensa Especial del oponente.", 10, 90));
        habilidadesSlowbro.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesSlowbro.add(crearHabilidad("Puño Hielo", "Hielo", "Un puñetazo helado que inflige daño al oponente y puede congelarlo.", 15, 75));
        habilidadesSlowbro.add(crearHabilidad("Placaje", "Normal", "No tiene efectos secundarios; simplemente inflige daño al oponente.", 35, 40));

        return new PokemonCombate("Slowbro", "Masculino", 95, 200, 2, 0, habilidadesSlowbro, "Slowbro es la evolución de Slowpoke y se caracteriza por su apariencia más robusta y su habilidad para usar ataques de tipo Psíquico y Agua con gran eficacia. Su personalidad relajada esconde una gran fuerza.");
    }

    private static PokemonCombate crearSeel() {
        ArrayList<Habilidades> habilidadesSeel = new ArrayList<>();
        habilidadesSeel.add(crearHabilidad("Aurora Boreal", "Hielo", "Crea una aurora helada que inflige daño al oponente y puede congelarlo.", 10, 60));
        habilidadesSeel.add(crearHabilidad("Pistola Agua", "Agua", "Lanza un chorro de agua que inflige daño a los Pokémon rivales a los que golpea.", 25, 100));
        habilidadesSeel.add(crearHabilidad("Rayo Hielo", "Hielo", "Lanza un rayo de energía helada hacia el oponente, con una probabilidad del 10% de congelarlo.", 10, 90));
        habilidadesSeel.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));

        return new PokemonCombate("Seel", "Femenino", 65, 200, 1, 0, habilidadesSeel, "Seel es un Pokémon de tipo Agua que se asemeja a una foca con un cuerpo blanco y un estilo de vida acuático. Tiene la habilidad de usar ataques de tipo Hielo para protegerse de sus enemigos.");
    }

    private static PokemonCombate crearDewgong() {
        ArrayList<Habilidades> habilidadesDewgong = new ArrayList<>();
        habilidadesDewgong.add(crearHabilidad("Aurora Boreal", "Hielo", "Crea una aurora helada que inflige daño al oponente y puede congelarlo.", 10, 60));
        habilidadesDewgong.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesDewgong.add(crearHabilidad("Rayo Hielo", "Hielo", "Lanza un rayo de energía helada hacia el oponente, con una probabilidad del 10% de congelarlo.", 10, 90));
        habilidadesDewgong.add(crearHabilidad("Surf", "Agua", "Genera una ola grande que golpea a todos los Pokémon rivales.", 15, 90));

        return new PokemonCombate("Dewgong", "Masculino", 90, 200, 3, 0, habilidadesDewgong, "Dewgong es la evolución de Seel y se caracteriza por su apariencia de foca más desarrollada y su habilidad para utilizar ataques de tipo Agua e Hielo. Su capacidad para nadar a gran velocidad y su resistencia en el agua lo hacen un Pokémon temible en combate.");
    }

    private static PokemonCombate crearShellder() {
        ArrayList<Habilidades> habilidadesShellder = new ArrayList<>();
        habilidadesShellder.add(crearHabilidad("Rayo Hielo", "Hielo", "Lanza un rayo de energía helada hacia el oponente, con una probabilidad del 10% de congelarlo.", 10, 90));
        habilidadesShellder.add(crearHabilidad("Pistola Agua", "Agua", "Lanza un chorro de agua que inflige daño a los Pokémon rivales a los que golpea.", 25, 100));
        habilidadesShellder.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesShellder.add(crearHabilidad("Aurora Boreal", "Hielo", "Crea una aurora helada que inflige daño al oponente y puede congelarlo.", 10, 60));

        return new PokemonCombate("Shellder", "Femenino", 30, 200, 1, 0, habilidadesShellder, "Shellder es un Pokémon de tipo Agua que tiene una concha dura que lo protege de ataques. Su habilidad para usar ataques de tipo Hielo lo hace un oponente formidable.");
    }

    private static PokemonCombate crearCloyster() {
        ArrayList<Habilidades> habilidadesCloyster = new ArrayList<>();
        habilidadesCloyster.add(crearHabilidad("Rayo Hielo", "Hielo", "Lanza un rayo de energía helada hacia el oponente, con una probabilidad del 10% de congelarlo.", 10, 90));
        habilidadesCloyster.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesCloyster.add(crearHabilidad("Aurora Boreal", "Hielo", "Crea una aurora helada que inflige daño al oponente y puede congelarlo.", 10, 60));
        habilidadesCloyster.add(crearHabilidad("Puño Hielo", "Hielo", "Un puñetazo helado que inflige daño al oponente y puede congelarlo.", 15, 75));

        return new PokemonCombate("Cloyster", "Masculino", 50, 200, 30, 0, habilidadesCloyster, "Cloyster es la evolución de Shellder y se caracteriza por su concha extremadamente dura y sus habilidades para usar ataques de tipo Hielo y Agua con gran precisión. Su caparazón puede resistir ataques poderosos y sus habilidades lo convierten en un oponente peligroso.");
    }

    private static PokemonCombate crearKrabby() {
        ArrayList<Habilidades> habilidadesKrabby = new ArrayList<>();
        habilidadesKrabby.add(crearHabilidad("Burbuja", "Agua", "Lanza una burbuja de agua que inflige daño al oponente y puede reducir su Velocidad.", 30, 40));
        habilidadesKrabby.add(crearHabilidad("Puño Fuego", "Fuego", "Un puñetazo ardiente que inflige daño al oponente y puede quemarlo.", 15, 75));
        habilidadesKrabby.add(crearHabilidad("Puño Trueno", "Eléctrico", "Un puñetazo eléctrico que inflige daño al oponente y puede paralizarlo.", 15, 75));
        habilidadesKrabby.add(crearHabilidad("Puño Hielo", "Hielo", "Un puñetazo helado que inflige daño al oponente y puede congelarlo.", 15, 75));

        return new PokemonCombate("Krabby", "Masculino", 30, 200, 1, 0, habilidadesKrabby, "Krabby es un Pokémon de tipo Agua que se asemeja a un cangrejo. Es conocido por su pinza grande y su habilidad para usar ataques de tipo Agua con eficacia.");
    }

    private static PokemonCombate crearKingler() {
        ArrayList<Habilidades> habilidadesKingler = new ArrayList<>();
        habilidadesKingler.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesKingler.add(crearHabilidad("Puño Hielo", "Hielo", "Un puñetazo helado que inflige daño al oponente y puede congelarlo.", 15, 75));
        habilidadesKingler.add(crearHabilidad("Puño Fuego", "Fuego", "Un puñetazo ardiente que inflige daño al oponente y puede quemarlo.", 15, 75));
        habilidadesKingler.add(crearHabilidad("Puño Trueno", "Eléctrico", "Un puñetazo eléctrico que inflige daño al oponente y puede paralizarlo.", 15, 75));

        return new PokemonCombate("Kingler", "Masculino", 55, 200, 30, 0, habilidadesKingler, "Kingler es la evolución de Krabby y se caracteriza por su enorme pinza que puede causar daño significativo a sus oponentes. Su habilidad para usar una variedad de ataques lo hace muy versátil en combate.");
    }

    private static PokemonCombate crearHorsea() {
        ArrayList<Habilidades> habilidadesHorsea = new ArrayList<>();
        habilidadesHorsea.add(crearHabilidad("Pistola Agua", "Agua", "Lanza un chorro de agua que inflige daño a los Pokémon rivales a los que golpea.", 25, 100));
        habilidadesHorsea.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesHorsea.add(crearHabilidad("Rayo Hielo", "Hielo", "Lanza un rayo de energía helada hacia el oponente, con una probabilidad del 10% de congelarlo.", 10, 90));
        habilidadesHorsea.add(crearHabilidad("Aurora Boreal", "Hielo", "Crea una aurora helada que inflige daño al oponente y puede congelarlo.", 10, 60));

        return new PokemonCombate("Horsea", "Masculino", 30, 200, 1, 0, habilidadesHorsea, "Horsea es un Pokémon de tipo Agua que se asemeja a un pequeño caballo marino. Es conocido por su habilidad para usar ataques de tipo Agua con precisión y su capacidad para nadar rápidamente.");
    }

    private static PokemonCombate crearSeadra() {
        ArrayList<Habilidades> habilidadesSeadra = new ArrayList<>();
        habilidadesSeadra.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesSeadra.add(crearHabilidad("Rayo Hielo", "Hielo", "Lanza un rayo de energía helada hacia el oponente, con una probabilidad del 10% de congelarlo.", 10, 90));
        habilidadesSeadra.add(crearHabilidad("Aurora Boreal", "Hielo", "Crea una aurora helada que inflige daño al oponente y puede congelarlo.", 10, 60));
        habilidadesSeadra.add(crearHabilidad("Pistola Agua", "Agua", "Lanza un chorro de agua que inflige daño a los Pokémon rivales a los que golpea.", 25, 100));

        return new PokemonCombate("Seadra", "Femenino", 55, 200, 5, 0, habilidadesSeadra, "Seadra es la evolución de Horsea y es conocido por su cuerpo más alargado y su capacidad para usar ataques de tipo Agua e Hielo con gran eficacia. Es un Pokémon rápido y ágil en el agua.");
    }

    private static PokemonCombate crearGoldeen() {
        ArrayList<Habilidades> habilidadesGoldeen = new ArrayList<>();
        habilidadesGoldeen.add(crearHabilidad("Pistola Agua", "Agua", "Lanza un chorro de agua que inflige daño a los Pokémon rivales a los que golpea.", 25, 100));
        habilidadesGoldeen.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesGoldeen.add(crearHabilidad("Rayo", "Eléctrico", "Un ataque eléctrico que puede paralizar al oponente.", 15, 50));
        habilidadesGoldeen.add(crearHabilidad("Puño Fuego", "Fuego", "Un puñetazo ardiente que inflige daño al oponente y puede quemarlo.", 15, 75));

        return new PokemonCombate("Goldeen", "Masculino", 45, 200, 1, 0, habilidadesGoldeen, "Goldeen es un Pokémon de tipo Agua que se asemeja a un pez con una apariencia elegante. Es conocido por su capacidad para usar ataques de tipo Agua con gran precisión.");
    }

    private static PokemonCombate crearSeaking() {
        ArrayList<Habilidades> habilidadesSeaking = new ArrayList<>();
        habilidadesSeaking.add(crearHabilidad("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110));
        habilidadesSeaking.add(crearHabilidad("Rayo", "Eléctrico", "Un ataque eléctrico que puede paralizar al oponente.", 15, 50));
        habilidadesSeaking.add(crearHabilidad("Puño Hielo", "Hielo", "Un puñetazo helado que inflige daño al oponente y puede congelarlo.", 15, 75));
        habilidadesSeaking.add(crearHabilidad("Puño Fuego", "Fuego", "Un puñetazo ardiente que inflige daño al oponente y puede quemarlo.", 15, 75));

        return new PokemonCombate("Seaking", "Masculino", 60, 200, 30, 0, habilidadesSeaking, "Seaking es la evolución de Goldeen y se caracteriza por su apariencia más imponente y sus habilidades mejoradas en combate. Es conocido por su habilidad para usar ataques de tipo Agua con gran eficacia.");
    }
}