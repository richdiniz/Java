import java.util.Scanner;

public class aq1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("numero 1:");
        float n1=input.nextFloat();
        System.out.println("numero 2:");
        float n2=input.nextFloat();
        float soma=(n1+n2);
        System.out.println("soma: "+soma);
        if (soma%2==0) {
            System.out.println(soma+" é par.");
            float ms=(soma/2);
            System.out.println("medade disso "+ms);
        }else{
            System.out.println("é impar!");
        }
        input.close();
    }
}
