import java.util.Scanner;

public class aq4{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("digite um valor ");
        double num= input.nextDouble();
        if(num>0){
            System.out.println("POSITIVO---"+num*2);
        } else if (num<0) {
            if (num%2==0) {
                System.out.println(num+" é Par");
            }else{
                System.out.print(num+" é Impar");
            }
        }else{
            System.out.println("ZER0000000");
        }
        input.close();
    }
}