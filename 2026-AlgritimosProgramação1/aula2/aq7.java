import java.util.Scanner;
//professor
public class aq7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char tipo;
        double consumo;
        double conta;
        System.out.println("informe o tipo de consumidor q vc é:(residencial[r], comercial[c] ou industrial[i])");
        tipo = input.next().charAt(0);
        System.out.println("consumo de agua em metros cúbicos: ");
        consumo = input.nextDouble();

        if (tipo == 'r') {
            conta = 5 + (consumo * 0.05);
        } else {
            if (tipo == 'c') {
                if (consumo <= 80) {
                    conta = 500;
                } else {
                    conta = 500 + (consumo - 80) * 0.25;
                }
            } else {
                if (tipo == 'i') {
                    if (consumo <= 100) {
                        conta = 800;
                    } else {
                        conta = 800 + (consumo - 100) * 0.04;
                    }
                } else {
                    System.out.println("Tipo inválido");
                    input.close();
                    return;
                }
            }
        }
        System.out.println("Valor da conta: R$ " + conta);
        input.close();
    }
}
