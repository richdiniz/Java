import java.util.Scanner;
/*Faça um programa que, inicialmente, solicite dois valores ao usuário e, na sequência, apresente
o seguinte menu de opções:
● 1 – Intervalo
● 3 – Alterar valores
● 6 – Sair
O programa deve ficar em execução até que o usuário escolha a opção “sair”, sendo que deve
ser apresentada uma mensagem de erro quando o usuário escolher uma opção inválida.
Descrição das operações que devem ser realizadas de acordo com a opção:
● Intervalo: apresenta os números existentes entre o maior e o menor os dois números ou a
informação que os números são iguais.
● Alterar valores, leia novamente os dois números.*/
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num1, num2;
        int opcao;

        // Leitura inicial
        System.out.print("Digite o primeiro valor: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        num2 = sc.nextInt();

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 – Intervalo");
            System.out.println("3 – Alterar valores");
            System.out.println("6 – Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            if (opcao == 1) {

                if (num1 == num2) {
                    System.out.println("Os números são iguais.");
                } 
                else {
                    int menor, maior;

                    if (num1 < num2) {
                        menor = num1;
                        maior = num2;
                    } else {
                        menor = num2;
                        maior = num1;
                    }

                    System.out.println("Números no intervalo:");

                    for (int i = menor + 1; i < maior; i++) {
                        System.out.println(i);
                    }
                }

            } 
            else if (opcao == 3) {

                System.out.print("Digite o primeiro valor: ");
                num1 = sc.nextInt();

                System.out.print("Digite o segundo valor: ");
                num2 = sc.nextInt();

            } 
            else if (opcao == 6) {

                System.out.println("Programa encerrado.");

            } 
            else {

                System.out.println("Erro: opção inválida.");

            }

        } while (opcao != 6);

        
        sc.close();
    }
}
////ler pra entender...