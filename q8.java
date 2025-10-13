// Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
//Calcule e mostre o total do seu salário no referido mês, sabendo-se que são 
//descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//a. Salário bruto;
//b. Quanto pagou ao INSS;
//c. Quanto pagou ao sindicato;
//d. O salário líquido.

import java.util.Scanner;

public class q8 {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Valor ganho por hora: ");
        double valorHora = ler.nextDouble();
        
        System.out.println("Horas trabalhadas: ");
        double horasTrabalhadas = ler.nextDouble();

        ler.close();

        double salarioBruto = valorHora * horasTrabalhadas;
        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
        
        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("IR: R$" + impostoRenda);
        System.out.println("INSS: R$" + inss);
        System.out.println("Sindicato: R$" + sindicato);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}
