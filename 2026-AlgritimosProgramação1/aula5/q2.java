import java.util.Scanner;

public class q2 {
    /*Leia a idade de 8 pessoas e mostre a média.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        double ids=0;
        while (i<8) {
            System.out.print(i+")idade: ");
            double idd=sc.nextDouble();
            ids+=idd;
            i++;
        }
        double media=ids/i;
        System.out.println("media de idade:"+media);
        sc.close();
    }
}
