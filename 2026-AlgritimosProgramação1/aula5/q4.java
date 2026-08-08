import java.util.Scanner;

public class q4 {
    /*Leia 10 números inteiros e mostre o maior e o menor entre eles.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int numero=0;
        int maior_n=-1;
        int menor_n=9999;
        while (i<10) {
            System.out.print("Digite um número: ");
            numero=sc.nextInt();
            if(maior_n<numero) {
                maior_n=numero;
            }if (menor_n>numero) {
                menor_n=numero;
            }
            i++;
        }
        System.out.println("--o maior é "+maior_n+", e o menor é "+menor_n+".");
        sc.close();
    }
}