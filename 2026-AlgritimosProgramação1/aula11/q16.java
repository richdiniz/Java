import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int i = 0;


        while (i < a.length){
            System.out.println("Insira o valor de posição "+(i+1)+".");
            a[i] = sc.nextInt();
            i += 1;
        }

        i = 0;
        while (i < a.length){
            int x = a[i];
            a[i] = a[i+1];
            a[i + 1] = x;

            i += 2;
        }

        i = 0;
        System.out.println("Vetor novo: ");
        while (i < a.length){
            System.out.println(a[i]+" ");
            i +=1;
        }
        sc.close();
    }
}
