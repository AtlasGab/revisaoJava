/* 20. Para um valor N inteiro informado pelo usuário, faça um programa para imprimir uma saída como
a mostrada abaixo. Use uma função que receba um valor N inteiro e imprima até a N-ésima linha.
1
1 2
1 2 3
...
1 2 3 ... n */

import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = ler.nextInt();

        imprimir(numero);

        ler.close();
    }

    public static void imprimir(int numero) {
        for (int i = 1; i <= numero; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            
            System.out.println();
        }
    }
}



