import java.util.Random;
import java.util.Scanner;
/*Faça um programa que sorteie um número de 1 a 100. O usuário deve tentar adivinhar o
número, digitando valores. O programa deve informar se o palpite é maior ou menor que o
número sorteado. O jogo termina quando o usuário acertar.*/
public class q8 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(100) + 1; // 1 a 100
        int palpite;

        System.out.println("Tente adivinhar o número de 1 a 100.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();

            if (palpite > numeroSorteado) {
                System.out.println("O número é MENOR.");
            } 
            else if (palpite < numeroSorteado) {
                System.out.println("O número é MAIOR.");
            } 
            else {
                System.out.println("Parabéns! Você acertou.");
            }

        } while (palpite != numeroSorteado);

        sc.close();
    }
}
