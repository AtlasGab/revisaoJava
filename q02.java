// 2. Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;

public class q02 {
    public static void main(String [] args){
        Scanner ler=new Scanner(System.in);
        
        System.out.println("Digite o raio do círcuçlo:");
        double raio = ler.nextDouble();

        double area = raio * raio * 3.14;

        System.out.println("Área do círculo: "+area);

        ler.close();

        
    }
}

