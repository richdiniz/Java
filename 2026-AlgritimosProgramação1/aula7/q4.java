import java.util.Scanner;
/*Nome do produto /Preço
Água               2.00
Refrigerante       3.00
Suco               4.00 */
public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bebida;
        int quantidade;

        // Preços
        double precoAgua = 2.0;
        double precoRefrigerante = 3.0;
        double precoSuco = 4.0;

        // Quantidades acumuladas
        int qtdAgua = 0;
        int qtdRefrigerante = 0;
        int qtdSuco = 0;

        System.out.print("Digite o nome da bebida (ou 'sair' para encerrar): ");
        bebida = sc.nextLine();

        while (!bebida.equalsIgnoreCase("sair")) {

            System.out.print("Digite a quantidade: ");
            quantidade = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (bebida.equalsIgnoreCase("agua")) {
                qtdAgua += quantidade;
            }
            else if (bebida.equalsIgnoreCase("refrigerante")) {
                qtdRefrigerante += quantidade;
            }
            else if (bebida.equalsIgnoreCase("suco")) {
                qtdSuco += quantidade;
            }
            else {
                System.out.println("Bebida inválida.");
            }

            System.out.print("Digite o nome da bebida (ou 'sair' para encerrar): ");
            bebida = sc.nextLine();
        }

        // Cálculo dos valores
        double totalAgua = qtdAgua * precoAgua;
        double totalRefrigerante = qtdRefrigerante * precoRefrigerante;
        double totalSuco = qtdSuco * precoSuco;

        double valorConta = totalAgua + totalRefrigerante + totalSuco;

        // Saída
        System.out.println("\n--- RESUMO DA CONTA ---");

        System.out.println("Água:");
        System.out.println("Quantidade: " + qtdAgua);
        System.out.println("Valor total: R$ " + totalAgua);

        System.out.println("\nRefrigerante:");
        System.out.println("Quantidade: " + qtdRefrigerante);
        System.out.println("Valor total: R$ " + totalRefrigerante);

        System.out.println("\nSuco:");
        System.out.println("Quantidade: " + qtdSuco);
        System.out.println("Valor total: R$ " + totalSuco);

        System.out.println("\nValor total da conta: R$ " + valorConta);
        sc.close();
    }
}
//ler pra entender...