import java.util.Scanner;
/*Faça um programa que leia as notas de um aluno (valores entre 0 e 10). O programa deve
perguntar se o usuário deseja digitar outra nota. Quando o usuário responder "não", o
programa deve calcular e mostrar a média das notas.*/
public class q6 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         double nota;
        double soma = 0;
        int quantidade = 0;
        String resposta;

        do {
            System.out.print("Digite uma nota (0 a 10): ");
            nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma = soma + nota;
                quantidade++;
            } else {
                System.out.println("Nota inválida. Digite um valor entre 0 e 10.");
            }

            System.out.print("Deseja digitar outra nota? (s/n): ");
            resposta = sc.next();

        } while (resposta.equalsIgnoreCase("s"));

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("Média das notas: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        sc.close();
    }
}
