
class Aluno {
String nome; 
int idade;
}
public class exe4 {
    public static void alterar( Aluno a){
        a.nome="pedro";
        a.idade=20;
    }
    public static void main(String[] args) {
        Aluno x=new Aluno();
        x.nome="MARIA";
        x.idade=18;
        alterar(x);
        System.out.println(x.nome);
        System.out.println(x.idade);
    }
}
