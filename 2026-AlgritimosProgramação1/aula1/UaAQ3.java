import java.util.Scanner;

public class UaAQ3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Digite o peso do prato cheio (em kg): ");
        double pPratoCheio = input.nextDouble();//area de entrada do dado

        double pPrato = 0.1; // peso do prato vazio
        double precoPorKg = 30.0;
               //calculos
        double pComida = pPratoCheio - pPrato;
        double valorFinal = pComida * precoPorKg;

        System.out.printf("Valor a pagar: R$ "+ valorFinal);
        input.close();
    }
}