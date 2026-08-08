import java.util.Scanner;
/*Escreva um programa que peça ao usuário para digitar um número e exiba a sua tabuada de 1 a
10. Após mostrar a tabuada, o programa deve perguntar se o usuário deseja calcular outra
tabuada. O loop continua até que o usuário responda "não".*/
public class q4 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String resposta="";
        do{
            System.out.print("digite um numero:   ");
            int num=sc.nextInt();
            int i=1;
//tabuada efetuando e se repetindo até o limite...
                while(i<=10){
                    System.out.println(num+" X "+i+" = "+(num*i));
                    i++;
                }
//pergunta se vai continuar...
            System.out.print("deseja calcular outra tabuada?[s/n] ");
            resposta=sc.next();
        }while(!resposta.equalsIgnoreCase("n"));
        sc.close();
    }
}