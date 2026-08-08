import java.util.Scanner;

public class q7 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

        int[][] matriz = new int[2][3];
        int[][] transposta = new int[3][2];

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Insira o valor do índice "+i+" "+j+".");
                matriz[i][j] = sc.nextInt();

                transposta[j][i] = matriz[i][j];
            }
        }


        System.out.println("Matriz original: ");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matriz transposta: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(transposta[i][j]+" ");
            }
            System.out.println();
        }
    sc.close();
    }
}
