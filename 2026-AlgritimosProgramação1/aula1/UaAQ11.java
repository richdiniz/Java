import java.util.Scanner;

public class UaAQ11 {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Salario:");
    float s=input.nextFloat();
    System.out.print("conta1:");
    float c1=input.nextFloat();
    System.out.print("conta2:");
    float c2=input.nextFloat();
    float pc1=c1+((c1/100)*2);
    float pc2=c2+((c2/100)*2);
    System.out.print("o valor total a pagar é "+(pc1+pc2));
    System.out.print(", valor q lhe resta é "+(s-(pc1+pc2)));
    input.close();
    }
}
