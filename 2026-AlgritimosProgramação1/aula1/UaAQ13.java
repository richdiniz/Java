import java.util.Scanner;

public class UaAQ13 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //FAZER CADASTRO:
        System.out.print("Digite o nome do cliente: ");
        String nome = input.nextLine();
        System.out.print("Digite o e-mail do cliente: ");
        String email = input.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefone = input.nextLine();
//EXIBINDO OS TREM...
        System.out.println("\n--- Cliente Cadastrado ---");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        input.close();
    }
}
