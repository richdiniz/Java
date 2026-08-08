import java.util.Scanner;
/*Faça um programa que leia 6 números inteiros e apresente:
● para cada número a informação se é positivo, negativo ou igual a zero;
● a quantidade de zeros digitados;
● a soma dos números positivos;
● a média de números negativos;
Dica: a média é sempre uma somatória dividida por uma quantidade.
*/
public class aq1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cont=0;
        int numero=0;
        int num_de_zeros=0;
        int soma_dos_POS=0;
        int neg=0;
        int negREP=0;
        int medNEG=0;
//laço        
        while(cont<6){
            System.out.print("Digite algum número: ");
            numero=input.nextInt();

            if (numero>0) {
                System.out.println("O número "+numero+" é positivo!");
                soma_dos_POS+=numero;
            }
            else if (numero<0) {
                System.out.println("O número "+numero+" é negativo");
                neg+=numero;
                negREP++;
            }
            else{
                System.out.println("O número "+numero+" é zero!");
                num_de_zeros++;
            }
            cont++;
        }
        medNEG=neg/negREP;
        System.out.println("-----Quantidade de zeros digitados: "+num_de_zeros);
        System.out.println("-----Soma dos positivos: "+soma_dos_POS);
        System.out.println("média dos negativos: "+medNEG);
        input.close();
    }
}