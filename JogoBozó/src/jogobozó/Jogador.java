package jogobozó;
import java.util.Scanner;
public class Jogador {
    String nome;
    int [] dadoo;
    Jogador(){
        this.dadoo = new int[5];
    }
    void jogaDado(Dado dado1, Dado dado2, Dado dado3, Dado dado4, Dado dado5){
        dadoo[0]=dado1.retornaFace();
        dadoo[1]=dado2.retornaFace();
        dadoo[2]=dado3.retornaFace();
        dadoo[3]=dado4.retornaFace();
        dadoo[4]=dado5.retornaFace();
    }

    void voltaDado(Dado dado){
        Scanner reader = new Scanner(System.in);
        System.out.println("Deseja trocar quantos dados?0-5");
        int r = reader.nextInt();
        if (r==0){
            System.out.println("Jogada finalizada.");
        }
        else{
            for(int i=0;i<r;i++){
                Scanner ler = new Scanner(System.in);
                System.out.println("Deseja trocar qual dado?0-5");
                int d = reader.nextInt();
                dadoo[d]=dado.jogarDado();
            }    
        }
    }
}
