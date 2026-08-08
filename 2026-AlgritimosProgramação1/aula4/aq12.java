import java.util.Scanner;
/*Faça um programa que leia a idade, a nacionalidade e o sexo de 6 pessoas, calcule e apresente:
● a quantidade de homens brasileiros (nacionalidade brasileira) que têm entre 20 e 30
anos;
● a quantidade de idosos (>= 65 anos) que são brasileiros, italianos ou franceses.
● a média das idades.
○ Dica: a média é sempre uma somatória dividida por uma quantidade.
*/
public class aq12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=0;
        String sx=""; String pais=""; double idade=0;
        int hbr_md25=0;
        int latinos=0;
        int id_soma=0;

        while (i<6) {
            System.out.print("Idade: ");
            idade=sc.nextDouble();
            System.out.print("Nacionalidade: ");
            pais=sc.next();
            System.out.print("Sexo(M/F): ");
            sx=sc.next();
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            
            if((pais.equalsIgnoreCase("brasileiro") && sx.equalsIgnoreCase("m")) && (idade>=20 && idade<=30)){
                hbr_md25++;
            }
            if (idade>=65) {
                if(pais.equalsIgnoreCase("brasileiro") || pais.equalsIgnoreCase("italiano") || pais.equalsIgnoreCase("frances")){
                    latinos++;
                }
            }
            id_soma+=idade;
            i++;
        }
        double id_media=id_soma/i;
        System.out.println("-Quantidade de homens brasileiros que têm entre 20 e 30 anos: "+hbr_md25);
        System.out.println("-Quantidade de idosos (>= 65 anos) que são brasileiros, italianos ou franceses: "+latinos);
        System.out.println("-Média das idades: "+id_media);
        sc.close();
    }
}