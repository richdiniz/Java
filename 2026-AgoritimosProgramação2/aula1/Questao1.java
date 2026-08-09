package aula1;

public class Questao1 {
	//Classes
	public class Telefone{
		String numero;
		String tipo;
	}
	public class Professor{
		String formcaoS;
		String salario;
		int qt_turmas;
		Telefone telefone;
	}
	public class Aluno{
		String curso;
		int idade;
		String transporte;
		Telefone telefone;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Olá, mundo! Questão1");
	}

}
