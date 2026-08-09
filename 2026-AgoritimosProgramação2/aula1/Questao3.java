package aula1;
import java.util.Scanner;
public class Questao3 {
	//classes_criadas:
	public static class Telefone3{
		String numero;
		String tipo;
	}
	public class Professor{
		String formcaoS;
		String salario;
		int qt_turmas;
		Telefone3 telefone;
	}
	public static class Aluno{
		String curso;
		int idade;
		String transporte;
		Telefone3 telefone;
	}
	//Metodos_para(telefone_aluno_imprimir):
//ler_telefone
	public static Telefone3 lerTelefone(){
		Scanner sc= new Scanner(System.in);
		Telefone3 t= new Telefone3();
		
		System.out.print("Q seu numero de telefone?");
		t.numero=sc.nextLine();
		System.out.print("Q o tipo dele?");
		t.tipo=sc.nextLine();
		
		return t;
	}
//ler_aluno	
	public static Aluno lerAluno(){
		Scanner sc= new Scanner(System.in);
		Aluno a= new Aluno();
		
		System.out.print("seu curso?");
		a.curso=sc.nextLine();
		System.out.print("idade?");
		a.idade=sc.nextInt();
		sc.nextLine();
		System.out.print("seu transporte?");
		a.transporte=sc.nextLine();
		//Chamando_a_funcao_telefone:
		a.telefone=lerTelefone();
		
		return a;
	}
//lista_imprimir:
	public static void imprimir(Aluno[] vetorAluno){
		System.out.print("\n#ALUNOS#");
		int i=1;
		for(Aluno aluno : vetorAluno){
			System.out.println("\n--- Aluno " +i+ ":");
            System.out.println("Curso: " + aluno.curso);
            System.out.println("Idade: " + aluno.idade);
            System.out.println("Transporte: " + aluno.transporte);
            System.out.println("Telefone: " + aluno.telefone.numero);
            System.out.println("Tipo: " + aluno.telefone.tipo);
            i++;
		}
	}
	//Conteudo_main:
	public static void main(String[] args){
		Aluno[] alunos = new Aluno[10];

        System.out.println("Questão 3:");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("\n#Aluno: " + (i + 1));
            alunos[i] = lerAluno();
	}
        imprimir(alunos);
	}
}
