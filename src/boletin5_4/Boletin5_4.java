/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho 
 */
public class Boletin5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int kgpolbo, kgpatacas;
        System.out.println("Introduce los kg de pulpo");
        Scanner kgpolboTeclado = new Scanner(System.in);
        kgpolbo = kgpolboTeclado.nextInt();
        System.out.println("Introduce los kg de patatas");
        Scanner kgpatacasTeclado = new Scanner(System.in);
        kgpatacas = kgpatacasTeclado.nextInt();
        Menu carta = new Menu();       
        carta.engadirPatacas(kgpatacas);
        carta.engadirPolbo(kgpolbo);
        System.out.println("Los kg de patatas son: "+carta.amosarPatacas() +" Los kg de pulpo son: "+carta.amosarPolbo()); 
        System.out.println("El numero de clientes que pueden comer es: "+carta.amosarClientes());
    }
    
}
