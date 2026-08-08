package q2;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        produto[]produtos= new produto[5];

        for (int i = 0; i <5; i++) {
            produtos[i]=new produto();
            System.out.print(i+") nome do produto:");
            produtos[i].nome=sc.next();
            System.out.print(i+") código do produto:");
            produtos[i].codigo=sc.nextInt();
            System.out.print(i+") preço do produto:");
            produtos[i].preco=sc.nextDouble();
            System.out.println();
        }
        for (int i = 0; i < produtos.length; i++) {
             System.out.println("produto: "+produtos[i].nome);
        }
        sc.close();
    }
}
