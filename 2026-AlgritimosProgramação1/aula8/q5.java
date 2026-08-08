import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p_A, p_B, taxaA, taxaB;
        double newpop_A=0, newpop_B=0;
        int i=0;

//Dados do país A:
        System.out.print("população do país A: ");
        p_A=sc.nextDouble();
        System.out.print("taxa de crescimento em %: ");
        taxaA=sc.nextDouble();

//Dados do país B:
        System.out.print("população do país B: ");
        p_B=sc.nextDouble();
        System.out.print("taxa de crescimento em %: ");
        taxaB=sc.nextDouble();

//Laço de repetição:
        do {
            newpop_A= p_A+((p_A*taxaA)/100);
            newpop_B= p_B+((p_B*taxaB)/100);
            p_A=newpop_A;
            p_B=newpop_B;
            i++;
        } while (!(newpop_B>newpop_A));
        
//final do programa:
        System.out.println("população atual do país A: "+p_A);
        System.out.println("população atual do país B: "+p_B);
        System.out.println("o país B ultrapassará o país A, em "+i+" anos.");

        sc.close();
    }
}
