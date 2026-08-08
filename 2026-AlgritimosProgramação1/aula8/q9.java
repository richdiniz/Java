import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nome; double nmf=0, aprovados=0, turma=0, s_n=0;
        do {
            System.out.print("nome: ");
            nome=sc.next();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            System.out.print("média final: ");
            nmf=sc.nextDouble();
            s_n+=nmf;
            if (nmf>=6) {
                aprovados++;
            }
            turma++;
        } while (!nome.equals("fim"));
        double media=s_n/turma;
        System.out.println("número de aprovados: "+aprovados);
        System.out.println("média geral da turma: "+media);
        sc.close();
    }
}
