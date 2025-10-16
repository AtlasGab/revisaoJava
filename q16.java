/*16. Faça um programa que peça para N pessoas a sua idade, ao final o programa deverá verificar se a
média de idade do grupo varia entre 0 e 25, 26 e 60 ou maior que 60; e então, dizer se o grupo se
classifica com jovem, adulto ou idoso, conforme as variações indicadas. */

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade = 0;
        int soma = 0;
        int i = 0;

        while(idade != -1){
            System.out.println("Digite a idade (digite -1 caso queira parar)");
            idade = ler.nextInt();

            if(idade == -1){
                ler.close();
                break;

            } else if(idade < -1){
                System.out.println("Entrada inválida");

            } else {
                soma += idade;
                i++;
            }
        }

        double media = soma/i;
        String classificacao;

        if(media <= 25){
            classificacao = "Jovem";
        }else if(media <=60) {
            classificacao = "Adulto";
        }else{
            classificacao = "Idoso";
        }
        
        System.out.println("Classificação do grupo: " + classificacao);
        
        
    }
}
