import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double nota=0;
        double soma_nota=0; 
        double i=0;
        double media; 
        String res="";

        do{ //primeiro chamado...
            System.out.print("Digite uma nota entre 0 10: ");
            nota=sc.nextDouble();
            if (nota>10 || nota<0) {
                break;
            }
            soma_nota += nota;
            i++;
            //segundo chamada...
            System.out.print("deseja digitar outra nota?[s/n]: ");
            res=sc.next();
            if (res.equalsIgnoreCase("n")) {
                break;
            }
            
        }while(nota>=0 && nota<=10);

        media=soma_nota/i;
        System.out.println("média: "+media);
        sc.close();
    }
}