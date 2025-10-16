// João é um pescador. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo
// regulamento de pesca do seu estado (50 quilos), ele deve pagar uma multa de R$ 4,00 por quilo excedente. 
//João precisa que você faça um programa que leia o peso de peixes e diga a quantidade excedente e o valor da multa para tal quantidade.

import java.util.Scanner;

public class q07 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de peixes(kg): ");
        double peixes = ler.nextDouble();

        double valorExcedente = peixes - 60;
        double multa = valorExcedente * 4;
        
        System.out.println("Quantidade excedente: "+valorExcedente);

        System.out.println("Valor da multa: R$" + multa);

        ler.close();
        

    }
}
