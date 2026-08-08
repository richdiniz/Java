import java.util.Scanner;
/*Uma loja está dando um desconto em suas compras, de acordo com o valor total da compra. Faça um
programa que leia o valor total da compra e exiba o valor final a ser pago pelo cliente, considerando as
seguintes regras:
-Se o valor total da compra for menor que R$ 100, não haverá desconto;
-Se o valor total da compra for entre R$ 100 e R$ 500, o desconto será de 10%;
-Se o valor total da compra for maior que R$ 500, o desconto será de 20%.*/
public class aq12{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor total da compra: ");
        double total = entrada.nextDouble();
        double valorFinal = total;

        if (total < 100) {
            System.out.println("Sem desconto.");
        } else if (total <= 500) {
            valorFinal = total - (total * 0.10);
            System.out.println("Desconto de 10% aplicado.");
        } else {
            valorFinal = total - (total * 0.20);
            System.out.println("Desconto de 20% aplicado.");
        }
        System.out.println("Valor final a pagar: R$ " + valorFinal);
        entrada.close();
    }
}