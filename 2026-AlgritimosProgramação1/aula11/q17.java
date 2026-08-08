import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] a= new int[10];
        int[] b= new int[10];

        int i=0;

        while (i<a.length) {
            System.out.print(" insira o valor da posição "+(i+1)+".");
            a[i]=sc.nextInt();
            i+=1;
        }

        i=0;

        while (i<a.length) {
            b[i]=a[i+1];
            b[i+1]=a[i];
            i+=2;
        }

        i=0;

        while (i<a.length) {
            System.out.println("Valor do vetor A na posição "+(i+1)+".");

            System.out.println(a[i]);
            i+=1;
        }
        i=0;
        while (i<b.length) {
            System.out.println("valor do vetor B na posição "+(i+1)+".");
            System.out.println(b[i]);
            i += 1;
        }

        sc.close();
    }
}