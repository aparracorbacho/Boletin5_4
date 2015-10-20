/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

/**
 *
 * @author aparracorbacho
 */
public class Menu {
    private int kgpolbo, kgpatacas;
    
   public void engadirPolbo(int kgpolboI ) {
       kgpolbo = kgpolbo + kgpolboI;
   }
   public void engadirPatacas ( int kgpatacasI) {
       kgpatacas = kgpatacas + kgpatacasI;
   }
   public int amosarPolbo() {
       return kgpolbo;
   }
   public int amosarPatacas () {
       return kgpatacas;
   }
   public int amosarClientes(){
       int clientespatacas, clientespolbo;
       clientespolbo = (int) (kgpolbo * 0.66) ;
       clientespatacas = (int) (kgpatacas * 0.33) ;
       if (clientespolbo<=clientespatacas) {
           return clientespolbo;
       }
       else
       {
           return clientespatacas;
       }
       }
   }
    

