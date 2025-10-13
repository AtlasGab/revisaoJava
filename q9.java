//Faça um programa para uma loja de tintas. 
//O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
//Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que 
//a tinta é vendida em latas de 18 litros, que custam R$ 80,00. 
//Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Área que será pintada(m²):");
        double area = ler.nextDouble();

        ler.close();

        double latas = (area / 3) / 18;

        if((latas - (int)latas) != 0 ){
            latas = (int)latas + 1;
        }

        double valor = latas * 80;

        System.out.println("Quantidade de latas necessárias: "+latas);

        System.out.println("Valor total: "+ valor);



    }
}
