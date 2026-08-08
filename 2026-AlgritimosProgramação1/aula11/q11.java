import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] NOTA1 = new double[10];
        double[] NOTA2 = new double[10];
        double[] MEDIAS = new double[10];

        int i = 0;

        // Entrada de dados
        while (i < 10) {
            System.out.print("Digite a NOTA1 do aluno " + i + ": ");
            NOTA1[i] = sc.nextDouble();

            System.out.print("Digite a NOTA2 do aluno " + i + ": ");
            NOTA2[i] = sc.nextDouble();

            i++;
        }

        // Cálculo das médias
        i = 0;
        while (i < 10) {
            MEDIAS[i] = (NOTA1[i] + NOTA2[i]) / 2;
            i++;
        }

        // Exibição dos aprovados
        i = 0;
        System.out.println("\nAlunos aprovados:");
        while (i < 10) {
            if (MEDIAS[i] >= 6.0) {
                System.out.println("Aluno código " + i + " - Média: " + MEDIAS[i]);
            }
            i++;
        }

        sc.close();
    }
}
