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
public abstract class Animal {
     private String raca;
       private String nome;
       private int idade;
       
       public void setNome(String nome){
           this.nome = nome;
       }
       
       public String getNome(){
           return this.nome;
       }
       
       public void comer(){ 
           System.out.println("Estou comendo");
       }
       
       public void dormir(){
           System.out.println("Estou dormindo");
           
       }
       
       public boolean equals(Animal a){
           return this.nome == a.getNome();
       }
       
       public abstract void emitirSom();
}
