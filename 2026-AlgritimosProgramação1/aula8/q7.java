import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int resposta;
        do {
            System.out.println("__DIGITE UM NÚMERO__");
            System.out.println("1-somar dois números");
            System.out.println("2-subtrair dois números");
            System.out.println("3-multiplicar dois números");
            System.out.println("4-dividir dois numeros");
            System.out.println("0-sair");
            resposta=sc.nextInt();
            if (resposta!=0) {
                System.out.print("numero 1: ");
                double n1=sc.nextDouble();
                System.out.print("numero 2: ");
                double n2=sc.nextDouble();
                if (resposta==1) {
                    System.out.println("resultado: "+(n1+n2));
                }else if(resposta==2) {
                    System.out.println("resultado: "+(n1-n2));
                }else if(resposta==3) {
                    System.out.println("resultado: "+(n1*n2));
                }else{
                    System.out.println("resultado: "+(n1/n2));
                }
            }else{
                break;
            }
        } while (resposta!=0);
        sc.close();
    }
}
