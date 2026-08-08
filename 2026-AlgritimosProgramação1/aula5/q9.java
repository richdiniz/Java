import java.util.Scanner;

public class q9 {
    /*Leia 5 números inteiros e, para cada um, mostre a tabuada de 1 a 10.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;  

        while (i<5) {
            System.out.print("Digite um numero: ");
            double numero=sc.nextDouble();
            int ii=1;
                while (ii<10) {
                System.out.println("-resultado de "+numero+" X "+ii+" = "+(numero*ii));
                ii++;
                }
                ii=1;
            i++;
        }
        sc.close();
    }
}