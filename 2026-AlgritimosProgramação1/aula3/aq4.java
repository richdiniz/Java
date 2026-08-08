import java.util.Scanner;
/*Uma instituição está promovendo um congresso internacional de computação, no qual os inscritos, no
momento da inscrição, podem escolher se participarão dos minicursos e se precisarão de tradução
simultânea. O valor da inscrição é calculado da seguinte forma:
- a inscrição no evento é de R$ 100.00 para estudantes e professores e R$ 150.00 para profissionais;
- caso a pessoa queira participar dos minicursos, acrescenta-se R$ 50.00 no valor da inscrição;
- caso a pessoa precise de tradução simultânea, acrescenta-se R$ 20.00 no valor da inscrição.
Faça um programa em que o usuário informa sua categoria (Estudante, Professor ou Profissional), se
deseja participar dos mini-cursos (S ou N) e se precisa de tradução simultânea (S ou N). A partir dessas
informações, informe o valor da inscrição a ser pago pelo usuário.
*/
public class aq4 {
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    System.out.print("(100 ou 150)Informe seua categoria: ");
    String r1=entrada.nextLine();
    System.out.print("(50)Informe se fará os mini-cursos: ");
    String r2=entrada.nextLine();
    System.out.print("(20)Informe se precisará de tradução: ");
    String r3=entrada.nextLine();
    if(r1.equalsIgnoreCase("professor") || r1.equalsIgnoreCase("estudante")){
        if(r2.equalsIgnoreCase("sim") || r2.equalsIgnoreCase("si") || r2.equalsIgnoreCase("s")){
            if(r3.equalsIgnoreCase("sim") || r3.equalsIgnoreCase("si") || r3.equalsIgnoreCase("s")){
                float valor_Final=100+50+20;
                System.out.println("o valor a pagar é "+valor_Final+"!");
            }else{
                float valor_Final=100+50;
                System.out.println("o valor a pagar é "+valor_Final+"!");
            }
        }else{
            if(r3.equalsIgnoreCase("sim") || r3.equalsIgnoreCase("si") || r3.equalsIgnoreCase("s")){
                float valor_Final=100+20;
                System.out.println("o valor a pagar é "+valor_Final+"!");
            }else{
                float valor_Final=100;
                System.out.println("o valor a pagar é "+valor_Final+"!");
            }
        }
    }else if(r1.equalsIgnoreCase("profissional")){
        if(r2.equalsIgnoreCase("sim") || r2.equalsIgnoreCase("si") || r2.equalsIgnoreCase("s")){
            if(r3.equalsIgnoreCase("sim") || r3.equalsIgnoreCase("si") || r3.equalsIgnoreCase("s")){
                float valor_Final=150+50+20;
                System.out.println("o valor a pagar é "+valor_Final+"!");
            }else{
                float valor_Final=150+50;
                System.out.println("o valor a pagar é "+valor_Final+"!");
            }
        }else{
            if (r3.equalsIgnoreCase("sim") || r3.equalsIgnoreCase("si") || r3.equalsIgnoreCase("s")){
                float valor_Final=150+20;
                System.out.println("o valor a pagar é "+valor_Final+"!");
            }else{
                float valor_Final=150;
                System.out.println("o valor a pagar é "+valor_Final+"!");
            }
        }
    }else{
        System.out.println("Error!");
    }
       entrada.close(); 
    }
}