import java.util.Scanner;

public class aq6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("___POSTO___");
        System.out.println("Ácool: R$5,00");
        System.out.println("Gasolina: R$7,00");
        System.out.println("Digite o liquido...");
        double liquido= input.nextDouble();
        System.out.println("Digite a qt de litros:");
        double qtLitro= input.nextDouble();
        if(qtLitro>30){
            double l30= (liquido*qtLitro)-(0.10*100);
            System.out.println("a pagar "+ l30);
        } else if(qtLitro>=20){
            double l20= (liquido*qtLitro)-(0.05*100);
            System.out.println("a pagar "+ l20);

        }else{
            double lx=(liquido*qtLitro);
            System.out.println("a pagar "+ lx);
        }
        input.close();
    }
}

/*
5$*20litros-(0,05*100)
*/