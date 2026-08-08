import java.util.Scanner;

public class aex3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("primeira nota:");
        double n1=entrada.nextDouble();
        System.out.print("segunda nota:");
        double n2=entrada.nextDouble();
        double media=(n1+n2)/2;
        System.out.println("--sua média é "+media+"--");
        if (media>=6.0) {
            System.out.println("Parabéns, vc foi aprovado: +999 RESPECT");
        } else if(media>=3){
            System.out.println("CUIDADO... Vai fazer EXAME!");
        }else{
            System.out.println("MELHORE... Vc foi reprovado: -999 RESPECT");
        }
        entrada.close();
    }
}
