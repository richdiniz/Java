import java.util.Scanner;
/*Suponha que você trabalha em uma loja de eletrodomésticos e precisa desenvolver um programa que
ajude a calcular o valor total de uma compra. O valor total da compra depende de alguns fatores, tais
como a quantidade de produtos comprados e o valor unitário de cada produto. Além disso, a loja
oferece um desconto de 10% para compras acima de R$ 1000,00.*/
public class aq6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Digite a quantidade de produtos: ");
        int quantidade = entrada.nextInt();
        System.out.print("Digite o valor unitário do produto: ");
        double valor_Unitario = entrada.nextDouble();

        double total = quantidade * valor_Unitario;
        if (total > 1000) {
            total = total - (total * 0.10);
            System.out.println("Desconto de 10% aplicado.");
        }
        System.out.println("Valor total da compra: R$ " + total);

        entrada.close();
    }
}
