/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.Juego;

import core.person.Juez;
import core.person.Jugador;
import java.util.ArrayList;

/**
 *
 * @author carlossarmiento
 */
public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Juez juez;
    private Juego juegoPrevio1;
    private Juego juegoPrevio2;
    private Juego juegoSiguiente;
    private ArrayList<Set> sets;
    
   public Juego(Jugador jugador1, Jugador jugador2, Juez juez) {
     this.jugador1 = jugador1;
     this.jugador2 = jugador2;
     this.juez = juez;
     this.juegoPrevio1 = null;
     this.juegoPrevio2 = null;
     this.juegoSiguiente = null;
     this.sets = new ArrayList<>();
     
     this.jugador1.addJuego(this);
     this.jugador2.addJuego(this);
     this.juez.addJuego(this);
   }

    public Juego (Juego juegoPrevio1, Juego juegoPrevio2, Juez juez) {
        this.jugador1 = juegoPrevio1.getGanador();
        this.jugador2 = juegoPrevio2.getGanador();
        this.juez = juez;
        this.juegoPrevio1 = juegoPrevio1;
        this.juegoPrevio2 = juegoPrevio2;
        this.juegoSiguiente = null;
        this.sets = new ArrayList<>();
        
        this.juegoPrevio1.setJuegoSiguiente(this);
        this.juegoPrevio2.setJuegoSiguiente(this);
        
        this.jugador1.addJuego(this);
        this.jugador2.addJuego(this);
        this.juez.addJuego(this);
    }

    
    public Jugador getGanador() {
        Set lastSet = this.sets.get(this.sets.size()-1);
        if (lastSet.getPuntosJugador1() > lastSet.getPuntosJugador2()) {
            return this.jugador1;
        }
        return this.jugador2;
    }
    
    public void addSets(Set set1, Set set2) {
        this.sets.add(set1);
        this.sets.add(set2);
    }

           
   public void addSets(Set set1, Set set2, Set set3) {
       this.sets.add(set1);
       this.sets.add(set2);
       this.sets.add(set3);
   }

    public void setJuegoSiguiente(Juego juegoSiguiente) {
        this.juegoSiguiente = juegoSiguiente;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public Juez getJuez() {
        return juez;
    }

    public ArrayList<Set> getSets() {
        return sets;
    }
   public ArrayList<Jugador> getSetWinners() {
        ArrayList<Jugador> setWinners = new ArrayList<>();
        for (Set set : this.sets) {
            if (set.getPuntosJugador1() > set.getPuntosJugador2()) {
                setWinners.add(this.jugador1);
            } else {
                setWinners.add(this.jugador2);
            }
        }
        return setWinners;
    }
    
    public Jugador getWinner() {
        Set lastSet = this.sets.get(this.sets.size() - 1);
        if (lastSet.getPuntosJugador1() > lastSet.getPuntosJugador2()) {
            return this.jugador1;
        }
        return this.jugador2;
    }   
   
}
