import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de N: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        int i = 0;

        while (i < a.length){
            System.out.println("Insira o valor "+(i+1)+" do vetor.");
            a[i] = sc.nextInt();

            i +=1;
        }

        i = 0;

        while (i< b.length){
            System.out.println("Insira o valor "+(i+1)+" do vetor.");
            b[i] = sc.nextInt();

            i +=1;
        }

        i = 0;

        while (i < c.length){
            c[i] = a[i] + b[n - 1 - i];

            i += 1;
        }

        i = 0;

        while (i < c.length){
            System.out.println("\n"+c[i]);

            i+=1;
        }
        sc.close();
    }
}
