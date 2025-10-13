//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
//calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Tamanho do arquivo(MB):");
        double tamanho = ler.nextDouble();

        System.out.println("Velocidade do link(Mbps):");
        double velocidade = ler.nextDouble();

        ler.close();

        double tempo = (tamanho * 8) / (60 * velocidade);

        System.out.println("Tempo estimado(min): "+tempo);
    }
}
