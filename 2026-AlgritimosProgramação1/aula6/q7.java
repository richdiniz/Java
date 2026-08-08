import java.util.Scanner;

public class q7 {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Consultar produto");
            System.out.println("3 - Excluir produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Produto cadastrado.");
            } 
            else if (opcao == 2) {
                System.out.println("Consultando produto.");
            } 
            else if (opcao == 3) {
                System.out.println("Produto excluído.");
            } 
            else if (opcao == 0) {
                System.out.println("Saindo do programa.");
            } 
            else {
                System.out.println("Opção inválida.");
            }

            System.out.println(); // linha em branco

        } while (opcao != 0);

        scanner.close();
    }
}
