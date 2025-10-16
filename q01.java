//1. Faça um programa que peça as 4 notas bimestrais de um estudante e mostre a média aritmética entre elas.

import java.util.Scanner;

public class q01{
    public static void main(String [] args){
        Scanner ler=new Scanner(System.in);

        System.out.println("Primeira nota:");
        double n1=ler.nextDouble();

        System.out.println("Segunda nota:");
        double n2=ler.nextDouble();

        System.out.println("Terceira nota:");
        double n3=ler.nextDouble();
        
        System.out.println("Quarta nota:");
        double n4=ler.nextDouble();

        double media = (n1+n2+n3+n4)/4;

        System.out.println("Média: "+media);

        ler.close();
    }
}