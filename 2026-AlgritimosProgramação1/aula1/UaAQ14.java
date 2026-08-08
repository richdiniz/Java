import java.util.Scanner;

public class UaAQ14 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("TecnoPlus");
        System.out.println("Digite seu nome:");
        String nome=input.nextLine();
        System.out.println("Digite se e-mail:");
        String email=input.nextLine();
        System.out.println("Parabéns, "+nome+"! Seu cadastro foi realizado e você ganhou um cupom de desconto de 10% para a sua primeira compra na tecnoPlus");
        System.out.println("Total da compra");
        float tc=input.nextFloat();
        float vd=((tc/100)*10);
        float tccc=(tc-vd);
        System.out.print("o valor da sua compra é "+tc+".\ncom o cupom você terá um desconto de "+ vd+"\n o valor final de: "+tccc);
        System.out.print(" "+email);
        input.close();
    }
}
