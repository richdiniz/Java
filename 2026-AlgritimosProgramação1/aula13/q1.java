import java.util.Arrays;
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        int[][] matriz= new int[3][3];
        Scanner sc= new Scanner(System.in);
        int i=0;//linhas
        int j=0;
        while (i<3) {
            j=0;
            while (j<3) {
                System.out.print("digite um numero para ");
                matriz[i][j]= sc.nextInt();
                j=j+1;
            }
            i=i+1;
        }
        System.out.println(Arrays.deepToString(matriz));//mostra matriz


        int ultimo=matriz[2][2];
        int cont=0;

        i=0;
        while (i<3) {
            j=0;
            while (j<3) {
                if (matriz[i][j]==ultimo) {
                    System.out.println("linha["+i+"] e coluna["+j+"].");
                    cont=cont+1;
                }
                j=j+1;
            }
            i=i+1;
        }

        System.out.println("qt ocorrencias:"+cont);
        sc.close();
    }
}