public class ex4 {
/*Exercício 4 – Correção de Comparação*/
    public static void main(String[] args) {
    String nome="Maria";
    System.out.println("seu nome é "+nome);

    if(nome.equals("Maria")){ 
    //== não compara o conteúdo da String em Java, ele compara se os dois objetos são o mesmo na memória.
    //O método .equals() compara o conteúdo textual das Strings.
    System.out.println("Nome correto.");
  }
 }
}