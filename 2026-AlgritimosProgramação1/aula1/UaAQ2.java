import java.util.Scanner;

public class UaAQ2 {
    public static void main(String[] args) {
        System.out.println("FAZENDO UM PROGRAMA QUE LER 2 VALORES E CALCULE/IMPRIMA: SOMA E O DOBRO DISSO.");
        //APRESENTAÇÃO
        Scanner input= new Scanner(System.in);// criação d parada pra entrada de dados
        System.out.print("elemento1: ");
        double e1= input.nextDouble();
        System.out.print("elemento2: ");
        double e2= input.nextDouble();
        double s= e1+e2;
        double d= (e1+e2)*2;
        System.out.println("R: soma: "+s);
        System.out.println("R: dobro da soma: "+d);
        input.close();
    }
}
