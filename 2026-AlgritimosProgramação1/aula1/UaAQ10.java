import java.util.Scanner;

public class UaAQ10 {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("identificação do funcionário:");
    int id=input.nextInt();
    System.out.println("horas trabalhadas no mês:");
    float ht=input.nextFloat();
    System.out.println("recebimento por hora:");
    float rh=input.nextFloat();
    System.out.print("id:"+id+"\nsalário:"+(ht*rh));
    input.close();
    }
}
