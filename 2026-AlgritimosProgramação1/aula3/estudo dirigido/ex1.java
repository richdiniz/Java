import java.util.Scanner;
/*Exercício 1 – Aprovação Escolar*/
public class ex1{
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        //lendo dados:
        System.out.print("Digite sua média: ");
        double media= entrada.nextDouble();
        System.out.print("Digite sua frequência(0-200 dias): ");//considerndo q um estudante médio tenha 200 dias de aula com 100% de frequência.
        double dias= entrada.nextDouble();
        double frequencia= (dias/2);//conversão
        if(media>=6 && frequencia>=75){
            System.out.print("Aprovado!");
            System.out.println(" Nota "+media+" , frequêcia de "+frequencia+"%.");
        }else{
            System.out.print("Reprovado!");
            System.out.println("Nota "+media+" , frequêcia de "+frequencia+"%.");
        }
        entrada.close();
    }
}