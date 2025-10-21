import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        while(true){
            System.out.print("Digite uma data (DD/MM/AAAA) ou 'sair': ");
            String data = ler.nextLine();

            if(data.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println(formatarData(data));
        }
        ler.close();
    }

    public static String formatarData(String data){
        String[] partes = data.split("/");
        String dia = partes[0];
        String mes = partes[1];
        String ano = partes[2];

        String[] meses = {
            "janeiro","fevereiro","março","abril","maio","junho",
            "julho","agosto","setembro","outubro","novembro","dezembro"
        };

        int numeroMes = Integer.parseInt(mes) - 1;
        String mesPorExtenso = meses[numeroMes];

        return dia + " de " + mesPorExtenso + " de " + ano;
    }
}
