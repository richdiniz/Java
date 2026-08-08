import java.util.Scanner;

public class UaAQ6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Informe um número (Dividendo):");
        float a= input.nextFloat();
        System.out.println("Informe outro número (Divisor):");
        float b= input.nextFloat();
        //calculo de divisão10
        float r1= a/b;
        System.out.println(" -Quociente "+r1);
        //calculo do modulo
        float r2= a%b;
        System.out.println(" -resto (modulo) "+r2); 
        input.close();
    }
}
