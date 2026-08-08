import java.util.Scanner;

public class q3 {
    /*Peça ao usuário para digitar a senha correta ("java123"). Ele terá 3
tentativas. Mostre se conseguiu ou não.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        String senha="";
        System.out.println("_DIGITAR A SENHA CORRETA_");
        while (i<3) {
            System.out.print("senha: ");
            senha=sc.next();
            
        if (senha.equals("java123")) {
            System.out.println("Vc conseguiu! acesso liberado.");
            break;
        }else{
            System.out.println("Você não conseguiu! acesso negado!");
        }
            i++;
        }
        sc.close();
    }
}