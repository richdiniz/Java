import java.util.Scanner;

public class aq2 {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.print("lado1:");
         double l1=input.nextDouble();
         System.out.println("lado2");
         double l2=input.nextDouble();
         if (l1==l2) {
            System.out.println("quadrado!");
         }else if( l1>l2) {
            System.out.println("Restangulo");
            System.out.println("lado 1 é maior");
         }else{
            System.out.println("Retangulo! lado2 é maior.");
         }
         input.close();
    }
}
