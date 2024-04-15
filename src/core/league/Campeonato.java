/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.league;

import core.Juego.Juego;
import java.util.ArrayList;

/**
 *
 * @author carlossarmiento
 */
public class Campeonato {
    
    private ArrayList<Juego> juegos;

    public Campeonato() {
        this.juegos = new ArrayList<>();
    }
    
    public Juego addJuego (int index) {
        return this.juegos.get(index);
    }
    
    public Juego getJuego(int index) {
        return this.juegos.get(index);
    }
}
