import java.util.Scanner;

public class UaAQ5 {
    public static void main(String[] args) {
        System.out.println("Q5- FABRICA:");
        Scanner input= new Scanner(System.in);
        System.out.print("quantiadade de clipes de plastico vendidos: ");
        float qPlastico=input.nextFloat();
        System.out.println("quantiadade de clipes de plastico vendidos: ");
        float qMetal=input.nextFloat();
        float vp=qPlastico*5;
        float vm=qMetal*10;
        System.out.println("valor arrecadado dos de plastco: "+vp);
        System.out.println("valor arrecadado dos de metal: "+vm);
        input.close();
    }
}