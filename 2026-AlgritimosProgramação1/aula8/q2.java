import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nome="", menor_n="";
        int qt;
        double total_estoque=0;
        int menor_qt=9999;
        do {
            System.out.print("nome do produto: ");
            nome=sc.next();
            if(nome.equalsIgnoreCase("fim")){
                break;
            }
            System.out.print("quantidade em estoque: ");
            qt=sc.nextInt();
            total_estoque+=qt; 
            if(qt<menor_qt){
                menor_qt=qt;
                menor_n=nome;
            }
        }while(!nome.equalsIgnoreCase("fim"));
        System.out.println("soma total de intens no estoque: "+total_estoque);
        System.out.println("produto com menor quantidade: "+menor_n+".");

        sc.close();
    }
}
