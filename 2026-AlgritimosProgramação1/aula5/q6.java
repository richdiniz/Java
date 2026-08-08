import java.util.Scanner;

public class q6 {
    /*Leia a nota de 10 alunos. Considere aprovados os que tiraram ≥ 7. Mostre
o total de aprovados e a porcentagem de aprovação.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int i=0;
         int aprovados=0;
        while (i<10) {
            System.out.print("nota: ");
            int nota=sc.nextInt();
            if (nota>=7) {
                aprovados++;
            }
            i++;
        }
        double p_aprov= aprovados*10.0;
        System.out.println("o total de aprovados "+aprovados+", e a porcentagem de aprovação "+p_aprov+"%");
        sc.close();
    }
}
