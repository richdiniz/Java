import java.util.Scanner;
/*Exercício 3 – Sistema de Desconto*/
public class ex3 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valor = entrada.nextDouble();
        entrada.nextLine(); 
        System.out.print("É cliente VIP? (sim/nao): ");
        String vip = entrada.nextLine();

        if (valor >= 200 || vip.equalsIgnoreCase("sim")) {
            System.out.println("Desconto concedido.");
        } else {
            System.out.println("Desconto não concedido.");
        }
        entrada.close();
    }
}