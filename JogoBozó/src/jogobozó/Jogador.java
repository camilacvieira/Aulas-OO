package jogobozó;
import java.util.Scanner;
public class Jogador {
    String nome;
    int [] cincoDados;
    Jogador(String nome){
    this.nome=nome;
    cincoDados=new int [5];
    }
    void jogaDado(Dado [] dados){
        for (int i=0; i<5; i++){
            cincoDados[i]=dados[i].jogarDado();
            System.out.println(cincoDados[i]);
        }
    }
    
    void palpite(){
        System.out.println("Escolha a sua jogada \n AS(1) - DUQUE(2) - TERNA(3) - QUADRA(4) - QUINA(5) - SENA(6) - FU(7) - SEGUIDA(8) - QUADRADA(9) - GENERAL(10)");
        Scanner input = new Scanner(System.in);
        int palpite = input.nextInt();
        int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0,p10=0;
        if(palpite==1){
            for(int i=0;i<5;i++){
                if(cincoDados[i]==1){
                    p1=cincoDados[i]+p1;
                }
            }
        }
        else if(palpite==2){
                for(int i=0;i<5;i++){
                    if(cincoDados[i]==2){
                    p2=cincoDados[i]+p2;
                    }
                }
        }
        else if(palpite==3){
                for(int i=0;i<5;i++){
                    if(cincoDados[i]==3){
                    p3=cincoDados[i]+p3;
                    }
                }        
        }
        else if(palpite==4){
                for(int i=0;i<5;i++){
                    if(cincoDados[i]==4){
                    p4=cincoDados[i]+p4;
                    }
                }        
        }
        else if(palpite==5){
                for(int i=0;i<5;i++){
                    if(cincoDados[i]==5){
                    p5=cincoDados[i]+p5;
                    }
                }        
        }
        else if(palpite==6){
                for(int i=0;i<5;i++){
                    if(cincoDados[i]==6){
                    p6=cincoDados[i]+p6;
                    }
                }        
        }
        else if(palpite==7){}
        else if(palpite==8){}
        else if(palpite==9){}
        else if(palpite==10){}
    }
    
    void voltaDado(Dado [] dados){
        Scanner reader = new Scanner(System.in);
        System.out.println("Deseja trocar quantos dados?0-5");
        int r = reader.nextInt();
        if (r==0){
            System.out.println("Jogada finalizada.");
        }
        else{
            for(int i=0;i<r;i++){
                Scanner ler = new Scanner(System.in);
                System.out.println("Deseja trocar qual dado?0(+1)-4(+1)");
                int d = reader.nextInt();
                cincoDados[d]=dados[d].jogarDado();
                System.out.println("Novo dado:"+cincoDados[d]);
            }    
        }
    }
}
