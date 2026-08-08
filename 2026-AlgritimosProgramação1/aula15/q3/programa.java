package q3;
import java.util.Scanner;

public class programa {
   public static void main(String[] args) {
    
     Scanner s=new Scanner(System.in);

    alunoo[]turma=new alunoo[4];
    double sNotas=0;

    //leitura dos dados:
    for (int i = 0; i < turma.length; i++){
      turma[i]=new alunoo();
      System.out.print("=== Aluno "+(i+1)+" ===");
      System.out.print("Nome: ");
      turma[i].nome=s.nextLine();

      System.out.print("Nota: ");
      turma[i].nota=s.nextDouble();
      s.nextLine();//limpar o Buffer

      sNotas+=turma[i].nota;
    }

    //média geral
    double media=sNotas/turma.length;

    //Encontrar aluno com maior nota

    alunoo maiorNota=turma[0];
    for (int i = 0; i < turma.length; i++) {
      if (turma[i].nota>maiorNota.nota) {
         maiorNota=turma[i];
      }
    }
    //Exibição dos resultados
    System.out.println("\n===== RESULTADOS =====");
    System.err.println("Média geral da turma: "+media);
    System.out.println("Aluno com maior nota: "+maiorNota.nome+" (Nota: "+maiorNota.nota+")");
    s.close();
   }
}
