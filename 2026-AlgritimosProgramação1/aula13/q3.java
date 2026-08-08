import java.util.Random;

public class q3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[3][3];

        int maior = Integer.MIN_VALUE;

        // Preencher a matriz com valores aleatórios e mostrar
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriz[i][j] = random.nextInt(100); // números de 0 a 99
                System.out.print(matriz[i][j] + "\t");
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Maior valor: " + maior);

        int cont = 0;

        // Contar quantas vezes o maior aparece
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if (matriz[i][j] == maior) {
                    cont++;
                }
            }
        }

        System.out.println("Quantidade de vezes que aparece: " + cont);
    }
}