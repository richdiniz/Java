import java.util.Scanner;

public class q12 {
    /*Leia 10 números inteiros e mostre o maior número digitado.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont= 1;

        System.out.print("Digite o 1º número: ");
        int numero = sc.nextInt();

        int maior = numero; // assume o primeiro como maior

        cont = 2;

        while (cont<= 10) {
            System.out.print("Digite o " + cont + "º número: ");
            numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            cont++;
        }

        System.out.println("\nO maior número digitado foi: " + maior);

        sc.close();
    }
}