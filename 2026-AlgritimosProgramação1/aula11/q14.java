import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int[] idade = new int[10];
        char[] sexo = new char[10];

        int i = 0;

        // Leitura dos dados
        while (i < 10) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade[i] = sc.nextInt();

            System.out.print("Digite o sexo da pessoa " + i + " (M/F): ");
            sexo[i] = sc.next().charAt(0);

            i++;
        }

        // a) Código das mulheres
        System.out.println("\nCódigo das mulheres:");
        i = 0;
        while (i < 10) {
            if (sexo[i] == 'F' || sexo[i] == 'f') {
                System.out.println("Código: " + i);
            }
            i++;
        }

        // b) Quantidade de homens menores de 21 anos
        int cont = 0;
        i = 0;
        while (i < 10) {
            if ((sexo[i] == 'M' || sexo[i] == 'm') && idade[i] < 21) {
                cont++;
            }
            i++;
        }

        System.out.println("\nQuantidade de homens menores de 21 anos: " + cont);

        sc.close();
    }
}
