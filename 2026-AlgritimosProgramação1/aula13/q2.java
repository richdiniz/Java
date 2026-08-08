import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] matriz= new int[5][5];
        int[] vetor= new int[5];

        int i=0, j=0;
        while (i<5) {
            j=0;
            while (j<5) {
                System.out.print("digite o elemento: ");
                matriz[i][j]=sc.nextInt();
                j++;
            }
            i++;
        }
                System.out.println(Arrays.deepToString(matriz));

        j=0;
        while (j<5) {
            vetor[j]=matriz[0][j];
            j++;
        }
        j=0;

        System.out.println("elementos:");
        while (j<5) {
            System.out.println(vetor[j]);
            j++;
        }

        sc.close();
    }    
}
