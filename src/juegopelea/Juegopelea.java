/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegopelea;

/**
 *
 * @author SENA
 */
public class Juegopelea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        zombiee zombie = new zombiee("ZombieX", 120, 25);
        Vampiroo vampiro = new Vampiroo("Drácula", 100, 30);

        Pelea.iniciarPelea(zombie, vampiro);
        
    }
    
}
