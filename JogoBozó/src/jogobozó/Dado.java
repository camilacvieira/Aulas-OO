/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogobozó;
import java.util.Random;

/**
 *
 * @author ice
 */
public class Dado {
    int faces;
    Random random  = new Random();
    int jogarDado(){
        for(int i = 0; i < 5; i++){
            faces = random.nextInt(6) + 1;
        }
        return faces;
    }  
    int retornaFace(){
        return faces;
    }
}
