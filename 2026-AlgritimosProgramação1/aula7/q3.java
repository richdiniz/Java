import java.util.Scanner;

public class q3 {
    /*Foi feita uma pesquisa para determinar o índice de mortalidade infantil em um certo período.
Fazer um programa que:
● Leia inicialmente o número de crianças nascidas no período;
● Leia, em seguida, um número indeterminado de linhas, contendo, cada uma, o sexo de
uma criança morta (F - feminino ou M - masculino) e o número de meses de vida da
criança. A última linha, que não entrará nos cálculos, contém um sexo inválido.
Determine e imprima:
● a porcentagem de crianças mortas no período, em relação ao total de nascidos;
● a quantidade de crianças que não chegou a completar um ano de vida;
● a quantidade de crianças do sexo masculino mortas no período, que viveu um ano ou
mais.*/
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String sexo=""; int idd_m=0; int nm_mortos=0;double mortos=0; int nf_1ano=0;

        System.out.print("número de crianças nascidas no período: ");
        int nc=sc.nextInt();

        do{
            System.out.print("sexo da criança morta [m/f]: ");
            sexo=sc.next();

            if (sexo.equalsIgnoreCase("x")) {
                break;
            }

            System.out.print("número de MESES de vida da criança morta: ");
            idd_m=sc.nextInt();
            System.out.println("___________________________________________");

            if (idd_m<12) {
                nf_1ano++;
            }
            if (sexo.equalsIgnoreCase("m") && idd_m>=12) {
                nm_mortos++;
            }
            
            mortos++;

        }while(!sexo.equalsIgnoreCase("x"));

        double p_cmp=(mortos / nc)*100;

        System.out.println("---porcentagem de crianças mortas no período, em relação ao total de nascidos: "+p_cmp+"%");
        System.out.println("---quantidade de crianças que não chegou a completar um ano de vida: "+(nf_1ano-1));
        System.out.println("---quantidade de crianças do sexo masc mortas no período, que viveu um ano ou mais: "+nm_mortos);
        sc.close();
    }
}
//ler pra entender...