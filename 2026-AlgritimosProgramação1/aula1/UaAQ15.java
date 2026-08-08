import java.util.Scanner;

public class UaAQ15 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    System.out.print("digite os anos ");
    int ida=input.nextInt();
    System.out.print("digite os meses ");
    int idm=input.nextInt();
    System.out.println("digite os dias ");
    int idd=input.nextInt();
    int td = (ida * 365) + (idm * 30) + idd;
    System.out.println("Idade final:"+td);
    input.close();
    }
}
