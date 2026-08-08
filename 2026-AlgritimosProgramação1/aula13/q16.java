import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] PONT = new double[2000][3];
        double total;
        double maiorRedacao = 0;

        // leitura das notas
        for (int i = 0; i < 2000; i++) {
            System.out.println("Aluno " + i);
            System.out.print("Português: ");
            PONT[i][0] = sc.nextDouble();
            System.out.print("Matemática: ");
            PONT[i][1] = sc.nextDouble();
            System.out.print("Redação: ");
            PONT[i][2] = sc.nextDouble();

            // verificar maior nota da redação
            if (i == 0 || PONT[i][2] > maiorRedacao) {
                maiorRedacao = PONT[i][2];
            }
        }
        System.out.println("\n--- RESULTADOS ---");

        for (int i = 0; i < 2000; i++) {
            total = PONT[i][0] + PONT[i][1] + PONT[i][2];
            System.out.println(
                "Aluno: " + i +
                " | Total: " + total
            );
        }
        System.out.println("\nMaior nota da redação: " + maiorRedacao);
        sc.close();
    }
}
