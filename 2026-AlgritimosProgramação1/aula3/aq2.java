/*Faça um programa que pergunte ao usuário:
a. Se ele está usando cinto de segurança
b. Se ele está sóbrio
c. Se o carro está com a revisão em dia
As respostas deverão ser ‘s’ (para sim) ou ‘n’ (para não).
O programa deve informar que o usuário não está em condições de dirigir com segurança caso responda
não para, pelo menos, uma dessas perguntas. Caso contrário, informa que o motorista está com
condição de dirigir com segurança.*/
import java.util.Scanner;
public class aq2 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("Você está usando cinto de segurança? ");
        String r1=entrada.nextLine();
        System.out.print("Você está sobrio? ");
        String r2=entrada.nextLine();
        System.out.print("Seu carro está com revisão em dia? ");
        String r3=entrada.nextLine();
        //estrutura de decissão:
        if (r1.equalsIgnoreCase("s")) {
            if (r2.equalsIgnoreCase("s")) {
                if (r3.equalsIgnoreCase("s")) {
                    System.out.print("Motorista (você) está em condição de dirigir com segurança.");
                }else{System.out.print("Não está em condições de dirigir!");}
            }else{System.out.print("Não está em condições de dirigir!");}
        }else{System.out.print("Não está em condições de dirigir!");}
        entrada.close();
    }
}