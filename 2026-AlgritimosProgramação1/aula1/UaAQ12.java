import java.util.Scanner;

public class UaAQ12 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Clara e seus problemas...");
        System.out.println("Altura:");
        float alt=input.nextFloat();
        System.out.println("Largura:");
        float larg=input.nextFloat();
        float area= alt*larg;
        float perimetro=(alt*2)+(larg*2);
        System.out.println("perímetro: "+perimetro+"\nArea: "+area);
        input.close();
    }
}
