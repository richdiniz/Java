import java.util.Scanner;

public class aq8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("VC é +18? para descobrir digite sua idade...");
        int id=input.nextInt();
        if (id>=18) {
            System.out.print("VOCÊ É MAIOR DE IDADE!");
        }else{
            System.out.print("VOCÊ NÃO É MAIOR DE IDADE!");
        }
        input.close();
    }
}
