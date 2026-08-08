import java.util.Scanner;
public class aex5{
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int cont=0;
        int soma=0;
        while (cont<3) {
            System.out.println("nome:");
            String nome=entrada.next();
            System.out.println("idade:");
            int idade=entrada.nextInt();
            soma= soma+idade;

            System.out.println("nome: "+nome+"| idade:"+idade);
            cont=cont+1;
        }
        double media= soma/cont;
        System.out.println("média"+media);
        entrada.close();
    }
}
//ex04, 06