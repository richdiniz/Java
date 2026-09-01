package aula1;
import java.util.Scanner;
public class Questao2 {
	//Classes
	public static class Telefone2{
		String numero;
		String tipo;
	}
	public class Professor{
		String formcaoS;
		String salario;
		int qt_turmas;
		Telefone2 telefone;
	}
	public static class Aluno{
		String curso;
		int idade;
		String transporte;
		Telefone2 telefone;
	}

	public static void main(String[] args) {
		Aluno[] alunos=new Aluno[10];
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Questão2:");
		for(int i=0; i<10; i++){
			System.out.println("#Aluno: "+(i+1));
			alunos[i]=new Aluno();
			
			System.out.print("Digite o curso:");
			alunos[i].curso=scanner.nextLine();
			
			System.out.print("Digite a idade:");
			alunos[i].idade=scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Digite seu trasporte:");
			alunos[i].transporte=scanner.nextLine();
			
			
			//
			alunos[i].telefone= new Telefone2();
			System.out.print("Qual seu o numero de telefone?");
			alunos[i].telefone.numero=scanner.nextLine();
			
			System.out.print("Qual o tipo dele?");
			alunos[i].telefone.tipo=scanner.nextLine();
			
			
		}
		
		System.out.println("\n===== DADOS DOS ALUNOS =====");

        for (int i = 0; i < 10; i++) {

            System.out.println("\n--- Aluno " + (i + 1) + " ---");
            System.out.println("Curso: " + alunos[i].curso);
            System.out.println("Idade: " + alunos[i].idade);
            System.out.println("Transporte: " + alunos[i].transporte);
            System.out.println("Telefone: " + alunos[i].telefone.numero);
            System.out.println("Tipo: " + alunos[i].telefone.tipo);
        }

		scanner.close();
	}

}
