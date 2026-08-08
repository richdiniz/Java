import java.util.Random;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rand= new Random();
        int n;
        //recebimento de dados...
        System.out.print("digite um número para quantidade de lin/col da matriz: ");
        n=sc.nextInt();
        sc.close();
        
        // imprimindo a matriz...
        int[][] matriz= new int[n][n];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                matriz[i][j]=rand.nextInt(777);
                System.out.print(matriz[i][j]+"|");
            }
            System.out.println();
        }

        //comparando o maior de cada linha...
        for (int i = 0; i<n; i++) {
            int maior=matriz[i][0];
            for (int j = 0; j<n; j++) {
                if (matriz[i][j]>maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println("Maior da linha " + i + ": " + maior);
        }
    }
}