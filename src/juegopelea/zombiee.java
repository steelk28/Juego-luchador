/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegopelea;

/**
 *
 * @author ASUS
 */
public class zombiee extends Personaje implements Zombie {

    public zombiee(String nombre, int vida, int ATK) {
        super(nombre, vida, ATK);
    }

    @Override
    public void propagacion() {
        System.out.println(nombre + " propaga infección"); 
    }

    @Override
    public void morder() {
        System.out.println(nombre + " muerde"); 
    }
    
}
