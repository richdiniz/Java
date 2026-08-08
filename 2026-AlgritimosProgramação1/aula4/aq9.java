import java.util.Scanner;
/*Em uma loja o salário mensal do vendedor é calculado considerando o salário mínimo mais uma comissão de 8% sobre o valor total das vendas efetuadas no mês. 
Escreva um programa que: 
● Leia inicialmente o valor do salário mínimo; 
● Leia, para 30 vendedores, o nome, o setor (r - roupas ou c - calçados) e o valor total das vendas efetuadas em um mês. Depois, informe: 
○ para cada vendedor, o nome e o salário mensal; V
○ o percentual de vendedores do setor de roupas; 
○ o maior salário dos setor de calçados.
*/
public class aq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario_Minimo;
        double salario_Final;
        String nome;
        String setor;
        double valor_vendas;
        int i = 0;
        int setor_roupas = 0;
        double m_salario_setor_calcado = 0;

        System.out.print("Digite o salário mínimo: ");
        salario_Minimo = sc.nextDouble();

        while (i < 30) {
            System.out.print("Nome: ");
            nome = sc.next();
            System.out.print("Setor (r - roupas ou c - calçados): ");
            setor = sc.next();
            System.out.print("Valor total das vendas: ");
            valor_vendas = sc.nextDouble();

            double comissao = valor_vendas * 0.08;
            salario_Final = salario_Minimo + comissao;

            System.out.println("Vendedor " + nome + ", salário: R$ " + salario_Final);

            if (setor.equalsIgnoreCase("r")) {
                setor_roupas++;
            } else if (setor.equalsIgnoreCase("c")) {
                if (salario_Final > m_salario_setor_calcado) {
                    m_salario_setor_calcado = salario_Final;
                }
            }

            i++;
        }

        double psr = (setor_roupas * 100.0) / 30;

        System.out.println("Percentual de vendedores do setor de roupas: " + psr + "%");
        System.out.println("Maior salário do setor de calçados: R$ " + m_salario_setor_calcado);

        sc.close();
    }
}
//DIFICIL