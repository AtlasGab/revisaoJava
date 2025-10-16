/*
 * Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina e calcule a
sua média aritmética. O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a situação. A atribuição de conceitos e situações obedece à tabela abaixo:

Média Aritmética    Conceito      Situação
[9.0 e 10.0)            A     Aprovado com Distinção
[7.5 e 9.0)             B           Aprovado
[6.0 e 7.5)             C           Aprovado
[4.0 e 6.0)             D          Reprovado
[0.0 e 4.0)             E          Reprovado
 */

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        double n1 = ler.nextDouble();

        System.out.println("Segunda nota: ");
        double n2 = ler.nextDouble();

        ler.close();

        double media = (n1 + n2) / 2;
        char conceito;
        String situacao;

        if (media >= 9) {
            conceito = 'A';
            situacao = "Aprovado com Distinção";

        } else if (media >= 7.5) {
            conceito = 'B';
            situacao = "Aprovado";

        } else if (media >= 6) {
            conceito = 'C';
            situacao = "Aprovado";

        } else if (media >= 4) {
            conceito = 'D';
            situacao = "Reprovado";

        } else {
            conceito = 'E';
            situacao = "Reprovado";
        }

        System.out.println("Média aritmética: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + situacao);
    }
}
