import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Digite um número inteiro: ");
         int numero = sc.nextInt();
         int i = 1;

         System.out.println("Divisores de " + numero + ":");

         while (i <= numero) {
            if (numero % i == 0) {
                System.out.println(i);
            }
            i++;
         }

        sc.close();
    }
}
