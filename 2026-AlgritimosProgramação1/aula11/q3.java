import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        String[] gabarito = {"A", "B", "C", "D", "E", "A", "B", "C", "D", "E"};

        String[] resposta = new String[10];

        int i = 0;
        while (i < resposta.length){
            System.out.print("Questão " + (i + 1) + ": ");
            resposta[i] = entrada.next();
            i++;
        }
        
        i = 0;
        int acertos = 0;
        System.out.println("Questões que errou: ");
        while (i < resposta.length){
            if (!resposta[i].equals(gabarito[i])){
                System.out.println("Quesão " + (i + 1));
            } else {
                acertos = acertos + 1;
            }
            i = i + 1;
        }

        if (acertos >= 6){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
        entrada.close();
    }
}
