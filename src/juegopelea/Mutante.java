/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegopelea;

/**
 *
 * @author SENA
 */
public class Mutante extends Personaje implements Lobo,Vampiro {

    public Mutante(String nombre, int vida, int ATK) {
        super(nombre, vida, ATK);
    }

    @Override
    public void olfato() {
        System.out.println("Lobo olfatea");
    }

    @Override
    public void saltar() {
        System.out.println("Salta alto");
    }

    @Override
    public void tomarSangre() {
        System.out.println("Toma mucha sangre");
    }

    @Override
    public void volar() {
        System.out.println("Vuela alto");
        
    }
    
}
