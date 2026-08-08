import java.util.Scanner;

public class notasAlunos{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont= 1;
        String nome;
        double nota;

        String melhorAluno = "";
        double maiorNota = -1;

        while (cont <= 10) {

            System.out.print("Digite o nome do aluno: ");
            nome = sc.nextLine();

            System.out.print("Digite a nota final: ");
            nota = sc.nextDouble();
            sc.nextLine(); // limpar a memoria

            String categoria;

            if (nota >= 9) {
                categoria = "Excelente";
            } else if (nota >= 7) {
                categoria = "Bom";
            } else if (nota >= 5) {
                categoria = "Regular";
            } else {
                categoria = "Insuficiente";
            }

            System.out.println("Aluno: " + nome + " | Categoria: " + categoria);

            if (nota > maiorNota) {
                maiorNota = nota;
                melhorAluno = nome;
            }

            cont++;
        }

        System.out.println("\nAluno com maior nota: " + melhorAluno);
        System.out.println("Maior nota: " + maiorNota);

        sc.close();
    }
}