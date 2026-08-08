import java.util.Scanner;

public class UaAQ16 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//entrada
        System.out.print("Valor da hora trabalhada: ");
        double vHora = input.nextDouble();
        System.out.print("Horas trabalhadas por semana: ");
        double hSemana = input.nextDouble();
        System.out.print("Percentual de desconto (%): ");
        double percentualDesconto = input.nextDouble();
//processamento
        double sBruto = vHora * hSemana * 4.5;
        double vDesconto = sBruto * (percentualDesconto / 100);
        double sLiquido = sBruto - vDesconto;
//resposta final
        System.out.printf("Salário bruto: R$ %.2f%n", sBruto);
        System.out.printf("Valor do desconto: R$ %.2f%n", vDesconto);
        System.out.printf("Salário líquido: R$ %.2f%n", sLiquido);
        input.close();
    }
}
