import java.util.Scanner;
/*Implemente um programa que solicite ao usuário digitar uma senha. A senha correta é "1234".
O programa deve continuar pedindo a senha até que o usuário acerte. Quando acertar, exiba a
mensagem "Acesso permitido!".*/
public class q5 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sen="";
        do {
            System.out.print("Digite a senha:  ");
            sen=sc.next();
        } while (!sen.equalsIgnoreCase("1234"));
        sc.close();
    }
}
