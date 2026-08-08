import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []vetor= new int[5];
        int [][]matriz= new int[5][5];

        for (int i = 0; i<vetor.length; i++) {
            System.out.println("valor do indice "+i+" do vetor:");
            vetor[i]=sc.nextInt();
        }
        for (int i = 0; i<5; i++) {
            for (int j = 0; j <5; j++) {
                matriz[i][j]=vetor[j]-i;
            }
        }
        System.out.println("\n matriz:");
        
        for (int i = 0; i<5; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
