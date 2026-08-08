import java.util.Scanner;

public class aex1{
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        //EXEMPLO DE CONDICIONAL SIMPLES:(média de aluno)
        System.out.print("Dgite a primeira nota:");
        double nota1=entrada.nextDouble();
        System.out.print("Digite a segunda nota:");
        double nota2=entrada.nextDouble();
        double media=(nota1+nota2)/2;
        System.out.println("sua nota foi "+media);
        //COMPARANDO MÉDIA:
        if(media>=6.0){
            System.out.print("Parabéns, tu foi aprovado.");
        }
        entrada.close();
        
    }
}