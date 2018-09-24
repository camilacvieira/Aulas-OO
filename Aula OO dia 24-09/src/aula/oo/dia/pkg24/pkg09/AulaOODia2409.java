/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.oo.dia.pkg24.pkg09;
import java.util.ArrayList;
/**
 *
 * @author ice
 */
public class AulaOODia2409 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<Animal>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Pato());
        for(int i=0;i<animais.size();i++){
            //animais.get(i).emitirSom();
            System.out.println(animais.get(i).toString()); //imprime endereço de memoria 
        }
        Gato g1 = new Gato();
        g1.nome="tobias";
        Gato g2 = new Gato();
        g2.nome="tobias";
        System.out.println(g1.equals(g2));//compara endereços de memoria         
    }   
}
