/* 15. Faça um programa que leia e valide as seguintes informações, mantendo o usuário preso até que
digite um valor válido:
- Nome: maior que 3 caracteres;
- Idade: entre 0 e 150;
- Salário: maior que zero;
- Sexo: “f” ou “m”;
- Estado Civil: “s”, “c”, “v”, “d”.
 */

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        do{
            System.out.println("NOME(maior do que 3 caracteres):");
            nome = ler.nextLine();

        }while(nome.length() <= 3);

        do{
            System.out.println("IDADE(entre 0 e 150):");
            idade = ler.nextInt();

        }while(idade < 0 || idade > 150);

        do{
            System.out.println("SALÁRIO(maior que 0):");
            salario = ler.nextDouble();

        }while(salario <= 0);

        do{
            System.out.println("SEXO('f' ou 'm'):");
            sexo = ler.next().charAt(0);

        }while(sexo != 'f' && sexo != 'm');

        do{
            System.out.println("ESTADO CIVIL('s','c','v','d'):");
            estadoCivil = ler.next().charAt(0);

        }while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');


        ler.close();
    }
}
