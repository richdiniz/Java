import java.util.Scanner;

public class questao3 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double idade=0; String nome=""; double valor_consulta=0; int cont=0; double s_idd=0;
        double m_j_a=999; String nome_j=""; double valor_a=0;

        while (!nome.equalsIgnoreCase("fim")) {
            System.out.println("nome do animal: ");
            nome=sc.next();
            System.out.println("idade (em anos): ");
            idade=sc.nextDouble();
            s_idd+=idade;
            System.out.println("valor da consulta: ");
            valor_consulta=sc.nextDouble();
            cont++;
            if (idade<m_j_a) {
                nome_j=nome;
            }
            valor_a+=valor_consulta;
        }
        System.out.println("total de atendimentos realizados: "+cont);
        System.out.println("media de idade dos animais: "+(s_idd/cont));
        System.out.println("nome do animal mais jovem: "+nome_j);
        System.out.println("valor arrecadado com as consultas: "+valor_a);
        sc.close();
    }
}