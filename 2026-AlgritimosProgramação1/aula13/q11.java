import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tamanho dos vetores: ");
        int tamanho = sc.nextInt();

        int[] a = new int[tamanho];
        int[] b = new int[tamanho];
        int[][] c = new int[2][tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Insira o valor do índice " + i + ".");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Insira o valor do índice " + i + ".");
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            c[0][i] = a[i];
            c[1][i] = b[i];
        }

        System.out.println("Matriz: ");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < tamanho; j++){
                System.out.print(c[i][j]+" ");
            }
            sc.close();
        }
    }
}
