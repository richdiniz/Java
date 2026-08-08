import java.util.Scanner;

public class UaAQ1 {
    public static void main(String[] args) {
        //apresentação do programa:
        System.out.println("Fazendo o programa que lê as 2 notas de um aluno, calcule e apresente seu nome e sua média...");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
//Acima é perguntado o nome + Variavél onde será armazenado o nome.

        System.out.print("Digite a primeira nota: ");//nota 1
        double n1= entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");//nota 2
        double n2= entrada.nextDouble();
//Acima é perguntado as notas + Variavél onde será armazenado as notas.

        double mdn= (n1+n2)/2;//Fazendo a média
//RESULTADO FINAL:
        System.out.println(nome+" obteve a média "+mdn);
        entrada.close();
    }
}
