import java.util.Scanner;
import java.util.ArrayList;

/*18. Faça um programa que leia um número indeterminado de valores, correspondentes a notas,
encerrando a entrada de dados quando for informado um valor igual a -1 (que não deve ser
armazenado). Após esta entrada de dados, faça:
a. Mostre a quantidade de valores que foram lidos;
b. Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
c. Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
d. Calcule e mostre a média aritmética dos valores;
e. Calcule e mostre a quantidade de valores acima da média calculada;
f. Calcule e mostre a quantidade de valores abaixo da média calculada;*/

import java.util.Scanner;
import java.util.ArrayList;

public class q18 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        double nota;
        double soma = 0;
        double media;
        int abaixoMedia = 0;
        int acimaMedia = 0;

        do {
            int contador = notas.size() + 1;
            System.out.print("Nota " + contador + ": ");
            nota = ler.nextDouble();

            if (nota == -1) break;

            notas.add(nota);
            soma += nota;
        } while (nota != -1);

        ler.close();

        int contador = notas.size();

        System.out.println("\nValores lidos: " + contador);

        for (int i = 0; i < contador; i++) {
            System.out.print(notas.get(i) + " ");
        }

        System.out.println("\n\nNotas na ordem inversa:");
        for (int i = contador - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        media = soma / contador;
        System.out.println("\nMédia: " + media);

        for (int i = 0; i < contador; i++) {
            if (notas.get(i) > media) acimaMedia++;
            else if (notas.get(i) < media) abaixoMedia++;
        }

        System.out.println("Notas acima da média: " + acimaMedia);
        System.out.println("Notas abaixo da média: " + abaixoMedia);
    }
}
