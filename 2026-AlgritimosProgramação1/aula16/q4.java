import java.util.Scanner;

class Alunob {
    String nome;
    double nota;

    public static void aumentarNota(Alunob alunob) {
        alunob.nota = alunob.nota + 1;
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Alunob alunob = new Alunob();

        System.out.print("Nome do aluno: ");
        alunob.nome = entrada.nextLine(); // Changed to nextLine() to capture full names

        System.out.print("Nota antes: ");
        alunob.nota = entrada.nextDouble();

        Alunob.aumentarNota(alunob);

        System.out.println("Nota depois: " + alunob.nota);
        
        entrada.close(); // Good practice to close the Scanner
    }
}
