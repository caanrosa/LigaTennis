/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.Juego.Juego;
import core.Juego.Set;
import java.util.ArrayList;

/**
 *
 * @author carlossarmiento
 */
public class Jugador extends Persona{
    
    private int sueldo;
    private ArrayList<Juego> juegos;

    public Jugador(String nombre, int sueldo) {
        this.sueldo = sueldo;
    }
    

    
    
    public void addJuego (Juego juego) {
        this.juegos.add(juego);
    }
    
}
