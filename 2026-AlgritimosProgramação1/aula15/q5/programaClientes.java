package q5;
import java.util.Scanner;

public class programaClientes {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    clientes[] lista = new clientes[5];

// Cadastro dos clientes
    for (int i = 0; i < lista.length; i++) {
    lista[i] = new clientes();
    System.out.println("=== Cliente " + (i + 1) + " ===");
    System.out.print("Nome: ");
    lista[i].nome = entrada.nextLine();
    System.out.print("CPF: ");
    lista[i].cpf = entrada.nextLine();
    System.out.print("Cidade: ");
    lista[i].cidade = entrada.nextLine();
}

// Ler cidade desejada
    System.out.print("\nDigite o nome da cidade para filtrar os clientes:");
    String cidadeBuscada = entrada.nextLine();

// Exibir apenas os clientes da cidade
    System.out.println("\n=== CLIENTES DE " + cidadeBuscada + " ===");
    boolean encontrou = false;
    for (int i = 0; i < lista.length; i++) {
        if (lista[i].cidade.equalsIgnoreCase(cidadeBuscada)) {
            System.out.println("Nome: " + lista[i].nome);
            System.out.println("CPF: " + lista[i].cpf);
            System.out.println("Cidade: " + lista[i].cidade);
            System.out.println("------------------------");
            encontrou = true;
        }
    }

    if (!encontrou) {
        System.out.println("Nenhum cliente encontrado para essa cidade.");
    }
    entrada.close();
    }
}
