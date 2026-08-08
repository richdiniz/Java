import java.util.Scanner;
/*15. Uma universidade deseja fazer um levantamento a respeito de seu concurso vestibular, de forma
que para cada um dos seus 10 cursos é fornecido o seguinte conjunto de valores.
● nome do curso
● número de vagas
● número de candidatos do sexo masculino
● número de candidatos do sexo feminino
Fazer um programa que:
● realize a leitura das informações dos cursos;
● calcule e escreva:
○ para cada curso: o nome, a quantidade total de candidatos e a informação se
preencheu as vagas ou não preencheu as vagas;
○ calcule e escreva a quantidade total de candidatos do sexo feminino no
departamento de computação, que é composto pelos cursos de CC, SI, ES e JG;
○ a quantidade de cursos que ofereceram mais que 50 vagas;
○ o maior número de candidatos do sexo masculino e o curso correspondente (supor
que não haja empate).
*/
public class aq15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int totalMulheresComputacao = 0;
        int cursosMais50Vagas = 0;
        int maiorMasculino = 0;
        String cursoMaiorMasculino = "";

        while (contador <= 10) {
            System.out.println("Curso " + contador);

            System.out.print("Nome do curso: ");
            String nome = scanner.next();

            System.out.print("Número de vagas: ");
            int vagas = scanner.nextInt();

            System.out.print("Número de candidatos masculinos: ");
            int masc = scanner.nextInt();

            System.out.print("Número de candidatos femininos: ");
            int fem = scanner.nextInt();

            int totalCandidatos = masc + fem;

            System.out.println("\n--- Resultado do curso ---");
            System.out.println("Nome: " + nome);
            System.out.println("Total de candidatos: " + totalCandidatos);

            if (totalCandidatos >= vagas) {
                System.out.println("Preencheu as vagas.");
            } else {
                System.out.println("Não preencheu as vagas.");
            }

            // Departamento de computação: CC, SI, ES, JG
            if (nome.equalsIgnoreCase("CC") ||
                nome.equalsIgnoreCase("SI") ||
                nome.equalsIgnoreCase("ES") ||
                nome.equalsIgnoreCase("JG")) {

                totalMulheresComputacao += fem;
            }

            // Cursos com mais de 50 vagas
            if (vagas > 50) {
                cursosMais50Vagas++;
            }

            // Maior número de candidatos masculinos
            if (contador == 1 || masc > maiorMasculino) {
                maiorMasculino = masc;
                cursoMaiorMasculino = nome;
            }

            System.out.println();
            contador++;
        }

        // Resultados finais
        System.out.println("=== RESULTADOS GERAIS ===");
        System.out.println("Total de candidatas no departamento de computação: "
                + totalMulheresComputacao);

        System.out.println("Quantidade de cursos com mais de 50 vagas: "
                + cursosMais50Vagas);

        System.out.println("Maior número de candidatos masculinos: "
                + maiorMasculino);

        System.out.println("Curso correspondente: "
                + cursoMaiorMasculino);

        scanner.close();
    }
}