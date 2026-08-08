import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("nome do jogador: ");
        String nome=sc.next();
        System.out.print("Qt de abates:");
        int kill=sc.nextInt();
        if (kill<0) {
            System.out.println("INVALIDO!");
        }else{
            if (kill<=3) {
                 System.out.print(nome+" iniciante!");
            }else if (kill<=7) {
                 System.out.print(nome+" intermediario");
            }else{
                 System.out.print(nome+" pro");
            }
        }
        sc.close();
    }
}