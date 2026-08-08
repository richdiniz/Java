import java.util.Scanner;
/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 50 pessoas.
Fazer um algoritmo que leia os dados, calcule e escreva:
● a maior e a menor altura do grupo;
● a média de altura das mulheres;
● o número de homens.*/
public class aq13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        double altura=0; double alt_f_s=0;
        String sexo="";
        double qt_f=0;
        int qt_h=0;
        double maior_alt=-1;
        double menor_alt=9999;
        while (i<50) {
            System.out.println("digite a sua altura: ");
            altura=sc.nextDouble();
            System.out.println("digite seu sexo: ");
            sexo=sc.next();

            if(sexo.equalsIgnoreCase("F")){
                alt_f_s+=altura;
                qt_f++;
            }else{
                qt_h++;
            }

            if(altura>maior_alt){
                maior_alt=altura;
            }
            if (altura<menor_alt) {
                menor_alt=altura;
            }
          i++;
        }
        double alt_f_med=alt_f_s/qt_f;
        System.out.println("a maior ("+maior_alt+") e a menor ("+menor_alt+") altura do grupo.");
        System.out.println("a média de altura das mulheres é "+alt_f_med+"!");
        System.out.println("número de homens: "+qt_h);
        sc.close();
    }
}