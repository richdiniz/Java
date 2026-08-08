import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        int i = 0;

        // Leitura do vetor A
        while (i < 10) {
            System.out.print("Digite o elemento A[" + i + "]: ");
            A[i] = sc.nextInt();
            i++;
        }

        // Leitura do vetor B
        i = 0;
        while (i < 10) {
            System.out.print("Digite o elemento B[" + i + "]: ");
            B[i] = sc.nextInt();
            i++;
        }

        // Copiando A para C
        i = 0;
        while (i < 10) {
            C[i] = A[i];
            i++;
        }

        // Copiando B para C (continuação)
        i = 0;
        while (i < 10) {
            C[i + 10] = B[i];
            i++;
        }

        // Exibindo vetor C
        i = 0;
        System.out.println("\nVetor C (junção de A e B):");
        while (i < 20) {
            System.out.println("C[" + i + "] = " + C[i]);
            i++;
        }

        sc.close();
    }
}
