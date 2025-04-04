/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegopelea;

/**
 *
 * @author ASUS
 */
public class Pelea {
    
    public static void iniciarPelea(Personaje zombiee, Personaje Vampiroo) {
        System.out.println(zombiee.nombre + " VS " + Vampiroo.nombre);
        
        
        while (zombiee.vida > 0 && Vampiroo.vida > 0) {
            Vampiroo.vida -= zombiee.ATK;
            System.out.println(zombiee.nombre + " ataca a " + Vampiroo.nombre + ", vida restante: " + Vampiroo.vida);
            
            if (Vampiroo.vida <= 0) {
                System.out.println(zombiee.nombre + " gana la pelea!");
                return;
            }
            
            zombiee.vida -= Vampiroo.ATK;
            System.out.println(Vampiroo.nombre + " ataca a " + zombiee.nombre + ", vida restante: " + zombiee.vida);
            
            if (zombiee.vida <= 0) {
                System.out.println(Vampiroo.nombre + " gana la pelea!");
                return;
            }
        }
    }
}

