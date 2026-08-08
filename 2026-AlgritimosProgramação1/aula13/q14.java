import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] pop = new int[23][10];

        // Leitura da matriz
        System.out.println("Digite a população dos 23 estados (10 municipios cada):");
        for (int i = 0; i < 23; i++) {
            System.out.println("Estado " + i + ":");
            for (int j = 0; j < 10; j++) {
                pop[i][j] = sc.nextInt();
            }
        }

        // ==============================
        // 1. Município mais populoso
        // ==============================
        int maior = pop[0][0];
        int estadoMaior = 0;
        int municipioMaior = 0;

        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < 10; j++) {

                if (pop[i][j] > maior) {
                    maior = pop[i][j];
                    estadoMaior = i;
                    municipioMaior = j;
                }
            }
        }

        System.out.println("\nMaior população: " + maior);
        System.out.println("Estado: " + estadoMaior);
        System.out.println("Município: " + municipioMaior);

        // ==============================
        // 2. Média das capitais (coluna 0)
        // ==============================
        double somaCapitais = 0;

        for (int i = 0; i < 23; i++) {
            somaCapitais += pop[i][0]; // coluna 0 = capital
        }

        double mediaCapitais = somaCapitais / 23;
        System.out.println("\nMédia das capitais: " + mediaCapitais);

        // ==============================
        // 3. Média de cada estado
        // ==============================
        System.out.println("\nMédia de cada estado:");

        for (int i = 0; i < 23; i++) {
            int soma = 0;

            for (int j = 0; j < 10; j++) {
                soma += pop[i][j];
            }

            double media = soma / 10.0;
            System.out.println("Estado " + i + ": " + media);
        }

        sc.close();
    }
}
