import java.util.Scanner;
/*Escreva um algoritmo que leia um número inteiro. Caso o número digitado seja par e positivo calcule e
apresente como resultado a metade deste número. Caso contrário, apresente como resultado o dobro
do número.*/
public class aq7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero > 0 && numero % 2 == 0) {
            System.out.println("Metade: " + (numero / 2));
        } else {
            System.out.println("Dobro: " + (numero * 2));
        }

        entrada.close();
    }
}