import java.util.Scanner;

public class q11 {
    /*Leia 10 números inteiros e conte quantos são positivos e quantos são
negativos.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont= 1;
        int numero;
        int positivos = 0;
        int negativos = 0;

        while (cont <= 10) {
            System.out.print("Digite o " + cont + "º número: ");
            numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } 
            else if (numero < 0) {
                negativos++;
            }
            // Se for zero, não conta como positivo nem negativo

            cont++;
        }

        System.out.println("\nQuantidade de positivos: " + positivos);
        System.out.println("Quantidade de negativos: " + negativos);

        sc.close();
    }
}
