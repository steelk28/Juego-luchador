/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegopelea;

/**
 *
 * @author ASUS
 */
public class Vampiroo extends Personaje implements Vampiro {

    public Vampiroo(String nombre, int vida, int ATK) {
        super(nombre, vida, ATK);
    }

    @Override
    public void tomarSangre() {
        System.out.println( nombre + " absorbe la sangre"); }

    @Override
    public void volar() {
        System.out.println( nombre + " Vuela para esquivar ataque"); }
    
}
