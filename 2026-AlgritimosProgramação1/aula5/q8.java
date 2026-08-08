import java.util.Scanner;

public class q8 {
    /*Leia 12 números inteiros. Conte e mostre quantos são pares e quantos são
ímpares.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont= 1;
        int numero;
        int pares = 0;
        int impares = 0;

        while (cont<= 12) {
            System.out.print("Digite o " + cont+ "º número: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            cont++;
        }
        System.out.println("\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
        sc.close();
    }
}
