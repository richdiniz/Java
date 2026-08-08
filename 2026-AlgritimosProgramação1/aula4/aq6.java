import java.util.Scanner;
/*Faça um programa que leia o nome, o peso e a altura de todas as 10 pacientes de uma
nutricionista. Calcule e apresente:
● o nome e a categoria de cada paciente, de acordo com a tabela;
● o menor IMC.
*/
public class aq6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=0;
        float peso=0;
        float altura=0;
        float imc=0;
        while (i<10) {
            System.out.print("Qual seu peso? ");
            peso=sc.nextFloat();
            System.out.print("Qual sua altura? ");
            altura=sc.nextFloat();
            imc=peso/(altura*altura);
            if (imc<18.5){
                System.out.println(imc+"---ABAIXO DO PESO");
            }else if (imc<25){
                System.out.println(imc+"---PESO NORMAL");
            }else if (imc<30) {
                System.out.println(imc+"---ACIMA DO PESO");
            }else{
                System.out.println(imc+"---OBESIDADE");
            }
            //System.out.println("--IMC de pessoa "+i+": "+imc);
            i++;
        }
        sc.close();
    }   
}