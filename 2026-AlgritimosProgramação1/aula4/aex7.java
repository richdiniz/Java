import java.util.Scanner;
public class aex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont= 0;
        double doacao;
        double total = 0;

        while (cont< 4) {
            System.out.print("Digite o valor da doação: ");
            doacao = entrada.nextDouble();
            total = total + doacao;
            cont++;
        }

        double media = total / 4;

        System.out.println("Total arrecadado: " + total);
        System.out.println("Média das doações: " + media);

        entrada.close();
    }
}