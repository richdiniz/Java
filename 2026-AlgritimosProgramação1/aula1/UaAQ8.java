import java.util.Scanner;

public class UaAQ8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("Nome do aluno: ");
        String nome = input.nextLine();
        System.out.print("Nota da prova 1: ");
        double n1 = input.nextDouble();
        System.out.print("Nota da prova 2: ");
        double n2 = input.nextDouble();
        System.out.print("Nota da prova 3: ");
        double n3 = input.nextDouble();

        double media = (n1 * 1 + n2 * 2 + n3 * 3) / 6;

        System.out.printf("Aluno:"+nome+"\nMédia ponderada: "+media);
        input.close();
    }
}