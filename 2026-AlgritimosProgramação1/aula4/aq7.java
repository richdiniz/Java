import java.util.Scanner;

public class aq7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int i=0;
        int peso_B_V=0;
        int maior_peso=-1;

        while (i<10) {
            System.out.println((i+1)+")peso do boi vendido: ");
            peso_B_V=sc.nextInt();
            i++;
        }
        if(peso_B_V>maior_peso){
            maior_peso=peso_B_V;
            System.out.println("---O BOI MAIS PESSADO É O DE "+maior_peso+"KG!");
        }
        sc.close();
    }
}
/* Faça um programa que leia o peso de 10 bois vendidos em um leilão. Na sequência, apresente o maior peso.*/