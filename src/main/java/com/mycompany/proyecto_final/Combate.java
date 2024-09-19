package com.mycompany.proyecto_final;
import java.util.ArrayList;
import java.util.Scanner;


public class Combate { 
    private ArrayList<PokemonCombate> equipoUsuario;
    private ArrayList<PokemonCombate> equipoComputadora;
    
    public Combate(ArrayList<PokemonCombate> equipoUsuario, ArrayList<PokemonCombate> equipoComputadora) {
        this.equipoUsuario = equipoUsuario;
        this.equipoComputadora = equipoComputadora;
    }
    public void iniciarCombate(Scanner scanner){
        int turnoUsuario = 0;
        int turnoComputadora = 0;
        
        while (!equipoUsuario.isEmpty() && !equipoComputadora.isEmpty()){
            System.out.println("Tu Pokemon actual: " + equipoUsuario.get(turnoUsuario).getNombre());
            System.out.println("Pokemon de la computadora: " + equipoComputadora.get(turnoComputadora).getGenero());
            
            System.out.println("Elige una habilidad para atacar: ");
            for (int i = 0; i < equipoUsuario.get(turnoUsuario).getHabilidades().size(); i++){
                Habilidades habilidad = equipoUsuario.get(turnoUsuario).getHabilidades().get(i);
                System.out.println((i + 1) + " " + habilidad.getNombreHabilidad() + " - Potencia: " + habilidad.getPotencia());
            }
            int seleccionHabilidad = scanner.nextInt();
            scanner.nextLine();
            
            if (seleccionHabilidad > 0 && seleccionHabilidad <= equipoUsuario.get(turnoUsuario).getHabilidades().size()) {
                Habilidades habilidadSeleccionada = equipoUsuario.get(turnoUsuario).getHabilidades().get(seleccionHabilidad - 1);
                realizarAtaque(habilidadSeleccionada, equipoComputadora.get(turnoComputadora));
                
                if (equipoComputadora.get(turnoComputadora).getHp_base() <= 0){
                    System.out.println("Has derrotado a " + equipoComputadora.get(turnoComputadora).getNombre());
                    equipoComputadora.remove(turnoComputadora);
                
                    if (equipoComputadora.isEmpty()){
                        System.out.println("Has ganado el combate");
                        return;
                    }
                }
                
            realizarAtaqueComputadora(equipoComputadora.get(turnoComputadora), equipoUsuario.get(turnoUsuario));
            
                if (equipoUsuario.get(turnoUsuario).getHp_base() <= 0){
                    System.out.println(equipoUsuario.get(turnoUsuario).getNombre() + " ha sido derrotado");
                    equipoUsuario.remove(turnoUsuario);

                    if (equipoUsuario.isEmpty()){
                        System.out.println("Has perdido el combate");
                        return;
                    }
                }
            } else {
                System.out.println("Seleccion no valida");
            }
        }
    }
    
    private void realizarAtaque(Habilidades habilidad, PokemonCombate objetivo){
        int daño = habilidad.getPotencia();
        objetivo.setHp_base(objetivo.getHp_base() - daño);
        System.out.println(objetivo.getNombre() + " ha recibido " + daño + " puntos de daño");
    }
    
    private void realizarAtaqueComputadora (PokemonCombate atacante, PokemonCombate objetivo) {
        int indiceHabilidad = (int) (Math.random() * atacante.getHabilidades().size());
        Habilidades habilidadSeleccionada = atacante.getHabilidades().get(indiceHabilidad);
        
        System.out.println("La computadora utiliza " + habilidadSeleccionada.getNombreHabilidad() + " con potencia " + habilidadSeleccionada.getPotencia());
        
        realizarAtaque(habilidadSeleccionada, objetivo);
    }
}