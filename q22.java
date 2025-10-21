import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um IP: ");
        String ip = ler.nextLine();

        if (ipValido(ip) == true) {
            System.out.println("IP válido!");
        } else {
            System.out.println("IP inválido!");
        }

        ler.close();
    }

    public static boolean ipValido(String ip) {
        if (ip == null || ip.isEmpty()){
            return false;
        }
    
        String[] partes = ip.split("\\.");

        if (partes.length != 4){
            return false;
        } 

        for (int i = 0; i < partes.length; i++) {   
            String parte = partes[i];              

            if (parte.isEmpty()) {                 
                return false;
            }

            try {
                int numero = Integer.parseInt(parte); 

                if (numero < 0 || numero > 255) {    
                    return false;
                }

            } catch (NumberFormatException e) {       
                return false;
            }
        }

        return true; 
    }
}

