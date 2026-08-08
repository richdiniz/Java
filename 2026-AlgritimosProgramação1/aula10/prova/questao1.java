import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("===ACADEMIA===");
        System.out.print("pontuação do seu densempenho [0 a 100]: ");
        int pont=sc.nextInt();
        System.out.print("quantidade de treinos que você faltou: ");
        int qt_tfalt=sc.nextInt();

        if (qt_tfalt<0 || pont>100) {
            System.out.println("ENTRADA INVÁLIDA");
        }
        else{
            if (qt_tfalt>8 || pont<40) {
            System.out.println("desempenho CRÍTICO!");
            } else if ((pont>=40 && pont<=59) && qt_tfalt<8) {
             System.out.println("desempenho BAIXO!");
            } else if ((pont>=60 && pont<=84) && qt_tfalt<8) {
            System.out.println("desempenho SATISFATÓRIO!");
            } else if ((pont>=85 && pont<=100) && qt_tfalt<8) {
            System.out.println("desempenho ALTO!");
            } 
        }

        
        sc.close();
    }
}