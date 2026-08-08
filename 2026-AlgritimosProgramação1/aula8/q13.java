import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int opcao = 0;
        double celsius, fahrenheit;

        while (opcao != 3) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Celsius -> Fahrenheit");
            System.out.println("2. Fahrenheit -> Celsius");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite a temperatura em Celsius: ");
                celsius = sc.nextDouble();
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

            } else if (opcao == 2) {
                System.out.print("Digite a temperatura em Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Temperatura em Celsius: " + celsius);

            } else if (opcao == 3) {
                System.out.println("Encerrando o programa.");

            } else {
                System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
