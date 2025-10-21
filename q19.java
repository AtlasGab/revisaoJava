/*Em uma competição de salto em distância cada atleta tem direito a cinco saltos. O resultado do
atleta será determinado pela média aritmética dos cinco saltos. Você deve fazer um programa que
receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe o nome,
os saltos e a média dos saltos. O programa deve ser encerrado quando não for informado o nome
do atleta. A saída do programa deve ser conforme o exemplo abaixo:
Atleta: Felipe Pinto
Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m
Resultado:
Atleta: Felipe Pinto

Saltos: 6.5 - 6.1 - 6.2 - 5.4 - 5.3
Média dos saltos: 5.9 metros */

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] ordem = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};
        double[] saltos = new double[5];

        String nome;
        double soma;
        double media;

        while(true){
            soma=0;

            System.out.print("Atleta: ");
            nome = ler.nextLine();
            if(nome.trim().isEmpty()){
                System.out.println("Programa Encerrado");
                break;
            }

            for(int i = 0; i < ordem.length; i++){
                System.out.print(ordem[i]+" salto: ");
                saltos[i] = ler.nextDouble();
                soma += saltos[i];
            }
            ler.nextLine();

            System.out.println();

            System.out.println("Resultado: ");
            System.out.println("Atleta: "+nome);

            System.out.print("Saltos: ");
            for(int i = 0; i < saltos.length; i++){
                if(i==saltos.length-1){
                    System.out.print(saltos[i]);
                }else{
                    System.out.print(saltos[i] + " - ");
                }
            }
            System.out.println();

            media = soma/saltos.length;
            System.out.println("Média dos saltos: "+media+" metros");

            System.out.println();
            System.out.println();

        }
        ler.close();
    }
}
