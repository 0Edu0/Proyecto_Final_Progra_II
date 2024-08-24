package com.mycompany.proyecto_final;

import java.util.Scanner;

public class Proyecto_Final {

    public static void main(String[] args) {
        
        ConexionDB conec = new ConexionDB();
        conec.estableceConexion();
        
        
        Proyecto_Final proyecto = new Proyecto_Final();
        proyecto.MenuPokemon(); 
    }

     public void MenuPokemon() {
         TipoPokemon tipoPokemon = new TipoPokemon();
         
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
        

        while (!salir) {
              System.out.println("Ingrese una opción:");
                System.out.println("1. Ver pokemones normales");
                System.out.println("2. Ver pokemones de Agua");
                System.out.println("3. Ver pokemones de Fuego");
                System.out.println("4. Ver pokemones de Planta");
                System.out.println("5. Ver pokemones eléctricos");
                System.out.println("6. Ver pokemones de Hielo");
                System.out.println("7. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

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
                    
                   case 7:
                   salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
            }
        }

        System.out.println("Programa terminado.");
    }
    
   

        
              

                

         
}