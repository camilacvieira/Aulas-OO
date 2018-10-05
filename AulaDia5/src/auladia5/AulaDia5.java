package auladia5;

public class AulaDia5 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.divide(0, 5)); 
        float [] vetor = new float[3]; 
        calc.percorreVetor(vetor);
    }
}
