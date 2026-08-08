import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] matriz = new char[5][4];
        int contador = 0;

        // Leitura da matriz
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a palavra de 4 letras da linha " + (i + 1) + ":");
            String palavra = sc.next();

            for (int j = 0; j < 4; j++) {
                matriz[i][j] = palavra.charAt(j);
            }
            // Verificação
            if (matriz[i][0] == matriz[i][3]) {
                contador++;
            }
        }
        System.out.println("Quantidade de palavras que começam e terminam com a mesma letra: " + contador);

        sc.close();
    }
}