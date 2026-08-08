import java.util.Scanner;
/*Faça um programa que leia notas de alunos até que o usuário digite uma nota negativa. Ao
final, mostre:
● A média das notas válidas;
● Quantas notas foram digitadas.
*/
public class q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double nota=0, nota_s=0;
        int vezes=0;
        do{
            System.out.print("notas do aluno:");
            nota=sc.nextDouble();
            if (nota<0) {
                break;
            }
            nota_s+=nota;
            vezes++;
        }while(!(nota<0));

        double media=nota_s/vezes;
        System.out.println("A média das notas válidas; "+media);
        System.out.println("Quantas notas foram digitadas? "+vezes);
        sc.close();
    }
}