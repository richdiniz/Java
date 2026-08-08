import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[4][4];

        // Leitura da matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        // a) Soma dos elementos com índices pares (0 e 2)
        int soma = 0;
        for (int i = 0; i < 4; i += 2) {      // linhas pares
            for (int j = 0; j < 4; j += 2) {  // colunas pares
                soma += A[i][j];
            }
        }

        // b) Produto da diagonal principal
        int produto = 1;
        for (int i = 0; i < 4; i++) {
            produto *= A[i][i];
        }

        // Saída
        System.out.println("Soma dos elementos de índices pares: " + soma);
        System.out.println("Produto da diagonal principal: " + produto);

        sc.close();
    }
}
