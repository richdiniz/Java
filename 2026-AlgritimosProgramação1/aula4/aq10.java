import java.util.Scanner;
/* Faça um programa que leia o nome e a idade de 100 pessoas. Ao final, informe o nome da pessoa mais velha, considerando que não houve empate.
*/
public class aq10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        String nome="";
        int idade=0;
        int mais_velho=-1;
        String mais_Velho_nome="";

        while (i<100) {
            System.out.print("nome: ");
            nome=sc.next();
            System.out.print("idade: ");
            idade=sc.nextInt();
            System.out.println("--------------");

                if (idade>mais_velho) {
                    mais_velho=idade;
                    mais_Velho_nome=nome;
                }
            i++;
        }
        System.out.println("--nome da pessoa mais velha '"+mais_Velho_nome+"'.");
        sc.close();
    }
}