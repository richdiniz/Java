import java.util.Scanner;

public class teste3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("digite sua idade: ");
        int idade = input.nextInt();
        System.out.print("digite sua altura: ");
        double altura = input.nextDouble();

        System.out.println("olá "+nome+" Vc tem "+idade+" anos "+" sua altura é "+altura+" m");
        input.close();
    }

}