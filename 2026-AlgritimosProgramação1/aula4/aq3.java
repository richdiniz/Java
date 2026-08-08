import java.util.Scanner;
/*Faça um programa que leia a idade, a nacionalidade e o sexo de 15 pessoas, calcule e apresente:
● a quantidade de mulheres maiores de idade;
● a quantidade de homens brasileiros (nacionalidade brasileira) que têm entre 20 e 30 anos;
● a média das idades.
● Dica: a média é sempre uma somatória dividida por uma quantidade.
*/
public class aq3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=0;
        int idade=0;
        String nacionalidade="";
        String sexo="";
        int qtfM=0;
        int qtmbr23=0;
        int soma_idade=0;
        
        while (i<15) {
            System.out.print("REPETIÇÃO NÚMERO "+i);
            System.out.print("\nidade:");
            idade=sc.nextInt();
            System.out.print("nacionalidade:");
            nacionalidade=sc.next();
            System.out.print("sexo:");
            sexo=sc.next();

            soma_idade+=idade;

            if (sexo.equalsIgnoreCase("f") && idade>=18) {
                qtfM++;
            }
            if (sexo.equalsIgnoreCase("m") && nacionalidade.contentEquals("brasil") && idade>=20 && idade<=30) {
                qtmbr23++;
            }
            System.out.println("-----------");
            i++;
        }
        int media_idade=0;
        media_idade=soma_idade/i;

        System.out.println("mulheres maiores de idade: "+qtfM);
        System.out.println("homens brasileiros que têm entre 20 e 30 anos: "+qtmbr23);
        System.out.println("média das idades: "+media_idade);
        sc.close();
    }
}