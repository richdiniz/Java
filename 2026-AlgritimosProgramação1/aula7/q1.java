/*
Crie um programa que solicite ao usuário o nome dos funcionários, a quantidade de horas
trabalhadas e o valor da hora de cada um deles e devolva: o nome e o salário de cada
funcionário, a média dos salários e o nome do funcionário que recebe o salário mais baixo,
considerando que não houve empate. Use nome do funcionário igual “fim” para encerrar a
leitura.
*/
import java.util.Scanner;
public class q1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        double horas, valorHora, salario;
        double somaSalarios = 0;
        int quantidade = 0;

        String nomeMenorSalario = "";
        double menorSalario = 0;

        System.out.print("Digite o nome do funcionário (ou 'fim' para encerrar): ");
        nome = scanner.nextLine();

        while (!nome.equalsIgnoreCase("fim")) {

            System.out.print("Quantidade de horas trabalhadas: ");
            horas = scanner.nextDouble();

            System.out.print("Valor da hora: ");
            valorHora = scanner.nextDouble();

            scanner.nextLine(); // limpar buffer

            salario = horas * valorHora;

            System.out.println("Funcionário: " + nome);
            System.out.println("Salário: R$ " + salario);
            System.out.println();

            somaSalarios += salario;
            quantidade++;

            // Verificar menor salário
            if (quantidade == 1) {
                menorSalario = salario;
                nomeMenorSalario = nome;
            } else if (salario < menorSalario) {
                menorSalario = salario;
                nomeMenorSalario = nome;
            }

            System.out.print("Digite o nome do funcionário (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();
        }

        if (quantidade > 0) {
            double media = somaSalarios / quantidade;

            System.out.println("Média dos salários: R$ " + media);
            System.out.println("Funcionário com menor salário: " + nomeMenorSalario);
        } else {
            System.out.println("Nenhum funcionário foi informado.");
        }

        scanner.close();
     }
}
//ler pra entender...