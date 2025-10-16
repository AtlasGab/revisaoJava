/*Uma barraca de rua está vendendo morangos e maçãs com a seguinte tabela de preços:

Fruta       Até 5 Kg            Acima de 5 Kg
Morango     R$ 2,50 por Kg      R$ 2,20 por Kg
Maçã R$     1,80 por Kg         R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
receberá ainda um desconto de 10% sobre o total. Escreva um programa para ler a quantidade
(em Kg) de morangos e a quantidade (em Kg) de maçãs adquiridas e escreva o valor a ser pago
pelo cliente.
 * 
 */

 import java.util.Scanner;

public class q14 {

    public static double calculaValor(double quantidade,double valorAte5Kg, double valorMaior5kg){
        if(quantidade > 5){
            return quantidade * valorMaior5kg;
        }else{
            return quantidade * valorAte5Kg;
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantidade de morango:");
        double qMorango = ler.nextDouble();

        System.out.println("Quantidade de maçã:");
        double qMaca = ler.nextDouble();

        ler.close();

        double vMorango = calculaValor(qMorango, 2.5, 2.2);
        double vMaca = calculaValor(qMaca, 1.8, 1.5);



        double qTotal = qMaca + qMorango;
        double vTotal = vMaca + vMorango;

        if(qTotal > 8 || vTotal > 25){
            vTotal*=0.9;
        }

        System.out.println("Valor: R$"+vTotal);

    }
    
}
