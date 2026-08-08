import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String u=""; int s=0, cont=0;

        System.out.print("usuário: ");
        String user=sc.next();
        System.out.print("senha: ");
        int senha=sc.nextInt();

        do {//login
            System.out.println("---confirmar dados---");
            System.out.print("usuário: ");
            u=sc.next();
            System.out.print("senha: ");
            s=sc.nextInt();
            cont++;
            if (cont>2) {
                System.out.println("Acesso bloqueado!");
                break;
            }
        } while (!u.equals(user) || s!=(senha));
        if (u.equals(user) && s==(senha)) {
            System.out.println("Acesso liberado! Bem vindo.");
        }
        

        sc.close();
    }
}
