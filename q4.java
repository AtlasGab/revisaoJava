// Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.

import java.util.Scanner;

public class q4 {
    public static void main(String [] args){
    Scanner ler= new Scanner(System.in);

    System.out.println("Digite a temperatura em Farenheit:");
    
    double tempF = ler.nextDouble();

    double tempC = (5 * (tempF - 32)) / 9;

    System.out.println("Temperatura em graus Celsius: " + tempC + "°C");

    ler.close();
    }
}
