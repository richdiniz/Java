import java.util.Scanner;

public class UaAQ7 {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

//entrada de dados:
    System.out.print("Digite A: ");
    int A = input.nextInt();
    System.out.print("Digite B: ");
    int B = input.nextInt();
    System.out.print("Digite C: ");
    int C = input.nextInt();
//Expresão numérica
    int R = (A + B) * (A + B);
    int S = (B + C) * (B + C);
    double D = (R + S) / 2.0;
//fim
    System.out.println("Resultado D = " + D);
    input.close();
    }
}