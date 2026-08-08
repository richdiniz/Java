import java.util.Scanner;

public class aex3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("Digite um número inteiro:");
        int numero= entrada.nextInt();
        int contador=0;
        while (contador<50) {
            System.out.println(numero);
            contador=contador+1;
        }
        entrada.close();
    }
}