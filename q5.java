// 5. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
// a. O produto do dobro do primeiro com metade do segundo.
// b. A soma do triplo do primeiro com o terceiro.
// c. O terceiro elevado ao cubo.

import java.util.Scanner;

public class q5 {
    public static void main(String [] args){
    Scanner ler= new Scanner(System.in);

    System.out.println("Número inteiro:");
    int int1 = ler.nextInt();

    System.out.println("Outro inteiro:");
    int int2 = ler.nextInt();

    System.out.println("Qualquer número real:");
    double real = ler.nextDouble();

    // int a = 2*int1 * int2/2; ou simplismente um vezes o outro
    int a = int1 * int2;
    double b = (double) int1*3 + real;
    double c = real * real * real; 
    System.out.println("O produto do dobro do primeiro com metade do segundo: " + a);
    System.out.println("A soma do triplo do primeiro com o terceiro:" + b);
    System.out.println("A soma do triplo do primeiro com o terceiro:" + c);

    ler.close();
    }
}
