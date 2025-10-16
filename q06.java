// 6. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule e mostre seu peso ideal. Use a fórmula:

import java.util.Scanner;

public class q06 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = ler.nextDouble();

        ler.close();

        double pesoIdeal = 72.7 * altura - 58;

        System.out.println("Peso ideal(Kg): " + pesoIdeal);
        

    }
}
