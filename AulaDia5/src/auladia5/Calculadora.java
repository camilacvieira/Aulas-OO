package auladia5;

public class Calculadora {
    public float divide(int divisor, int dividendo){
        float x=0;
        try{
            return dividendo/divisor;
        }   
        catch(ArithmeticException a){
            System.out.println("Erro "+a.getMessage());
            return x;
        }   
    }
    void percorreVetor(float [] vetor){
        float x;
        for(int y=0;y<5;y++){                                                       ///////REPETE O PRIMEIRO ERRO 5X///////
       //////////////////////////////ERRO 1////////////////////////////             ///////PARA NO PRIMEIRO ERRO///////
            try{
                for(int j=0;j<5;j++){
                  vetor[j]=j+2;
               }
            }   
            catch(Exception a){  
                System.out.println("Erro " + a.getMessage() + "  " + a.getCause());
            }
           /////////////////////////////////ERRO2 //////////////////////             ///////LOGO O ERRO 2 NAO E IMPRESSO///////
            for(int j=0;j<3;j++){
                vetor[j]=j+2;
             }
            try{ 
                for(int i=0;i<3;i++){
                    x=vetor[i]/0;
                }
            }
            catch(Exception b){
                System.out.println("Erro " + b.getMessage() + "  " + b.getCause());
            }
            ////////////////////////////////////////////////////////////
        }
        }
    
    
}
