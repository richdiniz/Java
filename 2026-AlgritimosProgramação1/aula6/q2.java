import java.util.Scanner;
/*Faça um programa que leia números inteiros positivos. O programa deve parar quando o usuário
digitar um número negativo. Ao final, mostre a soma de todos os números positivos digitados.*/
public class q2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int numero=0; int num=0;
        do{
            System.out.print("digite algum número...");
            numero=sc.nextInt();
            if(numero>=0){
                num+=numero;
            }
        }while(numero>=0);
        System.out.println("Soma:"+num);
    sc.close();
    }
}