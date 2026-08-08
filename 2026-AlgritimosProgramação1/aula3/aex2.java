import java.util.Scanner;

public class aex2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Tem alguma deficiência?");
        String pcd=entrada.nextLine();
        System.out.print("Idade: ");
        int idade= entrada.nextInt();
        if (pcd.equalsIgnoreCase("sim")|| idade>=65) {
            System.out.println("Atendimento prioritário!");
        }else{
            System.out.println("Atendimento normal!");
        }
        entrada.close();
    }
}
