import java.util.Scanner;
/*Faça um programa que leia um número e divida-o por dois (sucessivamente) até que o resultado
seja menor que 1. Mostre o resultado da última divisão e a quantidade de divisões efetuadas.*/
public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=0;int qde=0;

        System.out.print("digite um número:  ");
        double num=sc.nextDouble();
        r=num/2;
        while(r>1){
            System.out.println("veja "+r);
            r=r/2;
            if (r<=1) {
               System.out.println("veja "+r); 
            }
            qde++;
        }
        System.out.println("-----resultado da última divisão: "+r);
        System.out.println("-----quantidade de divisões efetuadas: "+(qde+1));
        sc.close();
    }
}
//ler pra entender...