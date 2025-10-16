/*17. O cardápio de uma lanchonete é o seguinte:

Produto                 Código          Preço
Cachorro-quente          100            R$ 1,20
Bauru simples            101            R$ 1,30
Bauru com ovo            102            R$ 1,50
Hambúrguer               103            R$ 1,20
Cheeseburguer            104            R$ 1,30
Refrigerante             105            R$ 1,00

Faça um programa que leia várias vezes o código e a quantidade do produto para formar um
pedido. Calcule e mostre o valor total do pedido. Considere que o pedido pode conter vários
produtos em diferentes quantidades e que o pedido será encerrado quando o código zero é
digitado. */

import java.util.Scanner;

public class q17 {
    

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int codigo = 1;
        double valorTotal = 0;

        while (codigo != 0) {
            System.out.print("Código:");
            codigo = ler.nextInt();
            System.out.println();
            valorTotal += lerValor(codigo);
        }

        ler.close();

        System.out.println("Valor total: R$"+valorTotal);
    }

    public static double lerValor(int codigoLido){
        switch (codigoLido) {
            case 100:
                return 1.2;
        
            case 101:
                return 1.3;

            case 102:
                return 1.5;

            case 103:
                return 1.2;

            case 104:
                return 1.3;

            case 105:
                return 1;

            default:
                return 0;
        }
        
    }
}
