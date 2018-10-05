/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladia24;

import java.util.ArrayList;

/**
 *
 * @author ice
 */
public class Auladia24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Animal> animais = new ArrayList();
         animais.add(new Cachorro());
         animais.add(new Gato());
         Gato gato1 = new Gato();
         gato1.setNome("Gatin");
         Gato gato2 = new Gato();
         gato2.setNome("Gatin");
         
         for(int i=0 ; i<animais.size() ; i++)
         {
             animais.get(i).emitirSom();
             System.out.println(animais.get(i).toString());
         }
         
         System.out.println(gato1.equals(gato2));
         
    }
    
}
