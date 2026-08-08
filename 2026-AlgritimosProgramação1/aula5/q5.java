import java.util.Scanner;

public class q5 {
    /*Leia o valor de 5 produtos e mostre o total gasto.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        double vlp=0;
        double soma=0;
        while (i<5) {
            System.out.print("valor do produto R$ ");
            vlp=sc.nextDouble();
            soma+=vlp;
            i++;
        }
        System.out.println("valor total gasto R$ "+soma);
        sc.close();
    }
}