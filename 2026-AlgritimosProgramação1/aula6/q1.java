import java.util.Scanner;

public class q1 {
    /*Crie um programa que pergunte ao usuário se deseja continuar digitando números. O programa deve solicitar um número inteiro e exibir o dobro dele. O loop deve ser repetido enquanto o usuário responder "sim".
    */
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String res="";

    
     do{System.out.println("digite algum número: ");
        int num=sc.nextInt();
        int n=num*2;
        System.out.println("("+n+") deseja continuar digitando números? ");
        res=sc.next();
        }
    while(res.equalsIgnoreCase("sim"));

    sc.close();
   }
}