package jogobozó;
import java.util.Scanner;
public class JogoBozó {
    public static void main(String[] args) {
        int jogadas ;
        Dado [] cincoDados;
        cincoDados = new Dado[5];       
        Jogador p1;
        p1 = new Jogador("camila");
        for (int i=0;i<5;i++){
            cincoDados[i] = new Dado(6);
        }
        p1.jogaDado(cincoDados);
        for(jogadas=0;jogadas<2;jogadas++){
            Scanner reader = new Scanner(System.in);
            System.out.println("Deseja trocar algum dado?(Não(0), Sim(1)");
            int r = reader.nextInt();
            if (r==0){
                System.out.println("Jogada finalizada.");
            }
            else{
                p1.voltaDado(cincoDados);
            }
        }
        p1.palpite();
        
        //p1.jogaDado(cincoDados);
        

    }    
}
