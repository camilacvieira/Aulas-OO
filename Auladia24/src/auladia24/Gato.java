/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladia24;

/**
 *
 * @author ice
 */
public class Gato extends Animal implements robo{

    @Override
    public void emitirSom() {
        System.out.println("MiaU!");
    }

    @Override
    public void aspirarChao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tocarMusica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
