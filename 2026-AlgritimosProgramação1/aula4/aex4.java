import java.util.Scanner;
public class aex4 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int cont=0;
        while (cont<10) {
            System.out.println("nome:");
            String nome=entrada.next();
            System.out.println("idade:");
            int idade=entrada.nextInt();
            System.out.println("nome: "+nome+"| idade:"+idade);
        }
          System.out.println("Laço encerrado!");
        entrada.close();
    }
}
//