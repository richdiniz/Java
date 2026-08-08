package q1;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        /*Aluno aluno1= new Aluno();
        aluno1.nome="Maria";
        aluno1.idade=20;
        aluno1.nota=8.9;

        System.out.println("informaçãoesm do aluno:");
        System.out.println("nome:"+aluno1.nome);
        System.out.println("idade"+aluno1.idade);
        System.out.println("nota:"+aluno1.nota);*/

        Scanner sc=new Scanner(System.in);

        Aluno[]alunos= new Aluno[35];

        for (int i = 0; i <alunos.length; i++) {
            alunos[i]= new Aluno();

            System.out.print("Digite o nome: ");
            alunos[i].nome=sc.next();
            System.out.print("Digite a idade: ");
            alunos[i].idade=sc.nextInt();
            System.out.print("Digite a nota: ");
            alunos[i].nota=sc.nextDouble();
            System.out.println();
        }

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("nome é "+alunos[i].nome);
            System.out.print(", idade é "+alunos[i].idade);
            System.out.print(" e a nota é "+alunos[i].nota);
            System.out.println();
        }
        sc.close();
    }
}
