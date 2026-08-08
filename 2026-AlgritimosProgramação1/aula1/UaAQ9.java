import java.util.Scanner;

public class UaAQ9 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("DOCEIRA E SEU LUCRO...");
        System.out.print("Digite as unidades vendidas:");
        float uv= input.nextFloat();
        System.out.print("Digite o preço da unidade:");
        float pu= input.nextFloat();
        System.out.print("Digite o custo de produção:");
        float cp= input.nextFloat();
        float lucro=(uv*pu)-(uv*cp)-500;
        System.out.print("seu lucro foi "+ lucro);
        input.close();
    }
}
