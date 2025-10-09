// 3. Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor ganho por hora:");
        double valor = ler.nextDouble();

        System.out.println("Horas trabalhadas no mês: ");
        double horas = ler.nextDouble();

        double salario = valor * horas;
        System.out.println("Salário total no mês: " + salario);

        ler.close();

    }
}
