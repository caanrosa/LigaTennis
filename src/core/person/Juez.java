/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.Juego.Juego;
import java.util.ArrayList;

/**
 *
 * @author carlossarmiento
 */
public class Juez extends Persona {
    
    private int edad;
    private ArrayList<Juego> juegos;

    public Juez(String nombre, int edad) {
        super(nombre);
       
        this.edad = edad;
        this.juegos = new ArrayList<>();
    }
    
    public void addJuego (Juego juego) {
        this.juegos.add(juego);
    }
    
   
    
    
}
