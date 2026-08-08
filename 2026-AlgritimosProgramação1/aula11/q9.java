import java.util.Scanner;

public class q9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] a = new int[10];
        int [] b = new int[5];
        int [] c = new int[5];

        int i = 0;

        while (i < 10){
            System.out.println("Insira o valor do índice "+i+" do vetor A: ");
            a[i] = sc.nextInt();
            i += 1;
        }

        i = 0;
        int x = 0;

        while (i < 10){
            if (i % 2 == 0){
                b[x] = a[i];

                x += 1;
            }
            i += 1;
        }

        i = 0;

        while ( i<5 ){
            c[i] = a[i] + b[i];


            i += 1;
        }

        i = 0;

        System.out.println("Vetor A: ");
        while (i<10){
            System.out.print(a[i]+" ");

            i+=1;
        }
        System.out.println("");

        i = 0;

        System.out.println("Vetor B: ");
        while (i<5){
            System.out.print(b[i]+" ");

            i+=1;
        }
        System.out.println("");

        i = 0;

        System.out.println("Vetor C: ");
        while (i<5){
            System.out.print(c[i]+" ");

            i+=1;
        }
        sc.close();
     }
}