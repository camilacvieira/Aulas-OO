
package jogobozó;
public class JogoBozó {
    public static void main(String[] args) {
        Dado d1, d2, d3, d4, d5;
        d1 = new Dado();
        d2 = new Dado();
        d3 = new Dado();
        d4 = new Dado();
        d5 = new Dado();
        Jogador p1, p2;
        p1 = new Jogador();
        p2 = new Jogador();  
        p1.jogaDado(d1, d2, d3, d4, d5);
        p2.jogaDado(d1, d2, d3, d4, d5);
        p1.voltaDado(d1);
    }    
}
