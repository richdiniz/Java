import java.util.Scanner;
/*Escreva um algoritmo que informe se um número digitado está compreendido entre 10 e 50, inclusive os
dois. Caso não esteja no intervalo indicado, informe se o número vem antes ou depois deste.*/
public class aq8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero >= 10 && numero <= 50) {
            System.out.println("O número está entre 10 e 50.");
        } else if (numero < 10) {
            System.out.println("O número vem antes do intervalo.");
        } else {
            System.out.println("O número vem depois do intervalo.");
        }
        entrada.close();
    }
}