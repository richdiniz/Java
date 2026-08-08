import java.util.Scanner;

public class UaAQ4 {
    public static void main(String[] args) {
        Scanner dddentrada= new Scanner(System.in);
        System.out.println("QUESTÃO 4, SOBRE O GASTO DE ENERGIA...");
        System.out.println("teu salario minimo:");
        float sM= dddentrada.nextFloat();
        System.out.println("quanto de KW é gsto na residência? ");
        float qKWgR= dddentrada.nextFloat();
        float kW= sM/1000;
        float vP= qKWgR*kW;
        System.out.println("Valor q tu deve pra energisa: "+vP);
        dddentrada.close();
    }
}
