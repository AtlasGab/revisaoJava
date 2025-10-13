//As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes. Assim, faça um programa que recebe o salário de um colaborador e calcule o reajuste segundo o seguinte critério: 

//Salários até R$ 280,00 (incluindo): aumento de 20%;
//- Salários entre R$ 280,00 e R$ 700,00 (incluindo): aumento de 15%;
//- Salários entre R$ 700,00 e R$ 1500,00 (incluindo): aumento de 10%;
//- Salários acima de R$ 1500,00: aumento de 5%

//Após o aumento ser realizado, informe na tela:
//- O salário antes do reajuste;
//- O percentual de aumento aplicado;
//- O valor do aumento;
//- O novo salário, após o aumento.

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Salário atual: ");
        double salario = ler.nextDouble();

        ler.close();

        double salarioReajustado = salario;
        String percentual;

        if(salario <= 280){
            salarioReajustado *= 1.20;
            percentual = "20%";
        } else if (salario > 280 && salario <= 700){
            salarioReajustado *= 1.15;
            percentual = "15%";
        } else if (salario > 700 && salario <= 1500){
            salarioReajustado *= 1.10;
            percentual = "10%";
        } else {
            salarioReajustado *= 1.05;
            percentual = "5%";
        }

        double aumento = salarioReajustado - salario;

        System.out.println("Salário antes do reajuste: R$"+salario);
        System.out.println("Percentual de reajuste: "+percentual);
        System.out.println("Valor do aumento: "+aumento);
        System.out.println("Salário reajustado: R$"+salarioReajustado);
    }
}