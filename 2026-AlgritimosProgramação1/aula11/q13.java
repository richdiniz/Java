import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] vetor_a= new int[5];
        int[] vetor_b= new int[5];
        int[] vetor_c=new int[10];

        int i=0;
        while (i<vetor_a.length) {
            System.out.print("A)Digite o valor da posição [" + i + "]: ");
            vetor_a[i] = sc.nextInt();
            i++;
        }
        i=0;
        while (i<vetor_b.length) {
            System.out.print("B)Digite o valor da posição [" + i + "]: ");
            vetor_b[i]=sc.nextInt();
            i++;
        }
        i=0;
        while (i<vetor_c.length) {
            System.out.println(vetor_c[i]=vetor_a[i]);
            System.out.println(vetor_c[i+1]=vetor_b[i]);
           
            i++;
        }

        sc.close();
    }

}