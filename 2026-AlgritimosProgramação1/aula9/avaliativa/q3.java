import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=0;
        String nome="";
        double salario=0; double soma_sal=0;
        System.out.print("nome do funcionário: ");
        nome=sc.next();
        int rpz_a=0;
        int rpz_b=0;
        int rpz_m=0;
        double m_s=9999;
        String m_n_s="";
        while (!nome.equalsIgnoreCase("fim")) {
            System.out.print("Salario: ");
            salario=sc.nextDouble();

            if (salario<=2000) {
                System.out.println("--baixa renda");
                soma_sal+=salario;
                rpz_b++;
                if (salario<m_s) {
                    m_s=salario;
                    m_n_s=nome;
                }
            }else if (salario<=5000) {
                System.out.println("--média renda");
                soma_sal+=salario;
                rpz_m++;
            }else{
                System.out.println("--alta renda");
                soma_sal+=salario;
                rpz_a++;
            }

            System.out.print("nome do funcionário: ");
            nome=sc.next();

            
            i++;
        }
        double media=soma_sal/i;
         System.out.println("____media salarial: "+media);
         System.out.println("____Quantia das pessoas da baixa reda "+rpz_b+", media renda "+rpz_m+" e alta renda "+rpz_a);
         System.out.println("____O percentual de funcionários na faixa 'Média renda' em relação ao total: "+(rpz_m*100)/i +"%");
         System.out.println("____Menor salario: "+m_s+" funcionário detentor: "+m_n_s);
         System.out.println("............Programa finalizado!");
        sc.close();
    }
}
