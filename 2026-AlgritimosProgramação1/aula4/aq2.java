import java.util.Scanner;
/*2. Faça um programa que leia o preço de compra e o preço de venda de 5 esculturas que serão expostas em uma galeria, calcule e apresente o lucro de cada escultura e a média dos lucros.*/
public class aq2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int i=0;
        double lucro1=0;
        double lucro2=0;
        double med_lucros=0;
        while (i<5) {
            System.out.print("\npreço de compra: ");
            double p_compra=entrada.nextDouble();//5
            System.out.print("preço de venda: ");
            double p_venda=entrada.nextDouble();//8

            lucro1= p_venda-p_compra;
            lucro2+= p_venda-p_compra;
            med_lucros = lucro2/5;

            System.out.print("lucro da escultura: "+lucro1);
            i++;
        }
        System.out.println("\n média dos lucros: "+med_lucros);

        entrada.close();
    }
}
