import java.util.Scanner;

public class exe3{
    public static void saudacao(String nome, int idade) {
        System.out.println("Olá "+nome+", você tem "+idade+"anos");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String dados[][]=new String[5][2];


        for(int i=0; i<5; i++) {
            System.out.print("Digite seu nome : ");
            dados[i][0]=sc.next();
            System.out.print("Digite sua idade: ");
            dados[i][1]=sc.next();
        }
        for (int j = 0; j <5; j++) {
            String nome=dados[j][0];
            int idade=Integer.parseInt(dados[j][1]);
            saudacao(nome,idade);
        }
        sc.close();
    }
}