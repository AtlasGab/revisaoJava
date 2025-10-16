/*13. Faça um programa que faça cinco perguntas para uma pessoa sobre um crime. As perguntas são:
- Telefonou para a vítima?
- Esteve no local do crime?
- Mora perto da vítima?
- Devia para a vítima?
- Já trabalhou com a vítima? */

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("[0] NÃO");
        System.out.println("[1] SIM\n");

        int[] respostas = new int[5];
        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };

        for (int i = 0; i < perguntas.length; i++) {
            do {
                System.out.println(perguntas[i]);
                respostas[i] = ler.nextInt();
            } while (respostas[i] != 0 && respostas[i] != 1);
        }

        ler.close();

        int totalRespostas = 0;
        for (int r : respostas) totalRespostas += r;

        System.out.print("Situação no crime: ");
        switch (totalRespostas) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3, 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
        }
    }
}
