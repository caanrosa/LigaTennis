/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.league;

import core.person.Juez;
import core.person.Jugador;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author carlossarmiento
 */
public class LigaTenis {
    
    private ArrayList<Campeonato> campeonatos;
    private ArrayList<Juez> jueces;
    private ArrayList<Jugador> jugadores;
    
    public LigaTenis() {
        this.campeonatos = new ArrayList();
        this.jueces = new ArrayList();
        this.jugadores = new ArrayList();
    }
    
    public boolean addJuez(Juez juez){
        this.jueces.add(juez);
        return true;
    }
    
    public boolean addJugador (Jugador jugador) {
        this.jugadores.add(jugador);
        return true;
    }
    
    public boolean addCampeonato (Campeonato campeonato) {
        this.campeonatos.add(campeonato);
        return true;
        
    }
    
    public Campeonato getCampeonato (int index) {
        return this.campeonatos.get(index);
    }
    
    public Juez getJuez(int index) {
        return this.jueces.get(index);
    }
    
    public Jugador getJugador(int index) {
        return this.jugadores.get(index);
    }
    
    public void calcSetsGanadosJugadoresCampeonato(int index) {
        HashMap<Jugador, Integer> frecuenciaJugadoresSets = this.campeonatos.get(index).getFrecuenciaJugadoresSets();
        for (Jugador jugador : this.jugadores) {
            System.out.println("El jugador: " + jugador.getNombre() + " gano " + frecuenciaJugadoresSets.get(jugador) + " sets en el campeonato");
        }
    }
}
