import java.util.Random;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand= new Random();
        int nS= rand.nextInt(50)+1;
        int palpite=0;
        int tent=0;

        System.err.println("Adivinhe o numero");
        while (palpite!=nS) {
            System.out.println("digite seu palpite: ");
            palpite=sc.nextInt();
            tent++;
            if (palpite<nS) {
                System.out.println("numero é maior...");
            }else if (palpite>nS){
                System.out.println("o numero é menor...");
            }else{
                System.out.println("Achou!");
            }
        }
        System.out.println("parabéns! foram "+tent+" tentativas do usuário.");
        sc.close();
    }
}
