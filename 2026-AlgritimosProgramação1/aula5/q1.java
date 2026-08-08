import java.util.Scanner;

public class q1 {
    /*Leia 10 números inteiros e mostre a soma total.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int numero;
        int s_total=0;
        System.out.println("--Digite 10 números inteiros--");
        while(i<10){
            System.out.print("Digite um número: ");
            numero=sc.nextInt();
            s_total+=numero;
            i++;
        }
        System.out.println("---A soma total é "+s_total);
        sc.close();
    }
    
}
