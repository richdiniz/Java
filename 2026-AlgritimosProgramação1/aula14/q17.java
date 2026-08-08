import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        int maior=0, numero1=0, numero2=0;
        Scanner s=new Scanner(System.in);
        System.out.print("digite n1:");
        numero1=s.nextInt();
        System.out.print("digite n2:");
        numero2=s.nextInt();


        if(numero1>numero2){
            maior=numero1;
            for(int i=0; i<(maior-numero2); i++){
                numero1-=1;
                if(numero1==numero2){
                    break;
                }
                System.out.print(numero1+", ");
            }
        }

        else if(numero2>numero1-2){
            maior=numero2;
            for(int i = 0; i<(maior-numero1); i++){
                numero2-=1;
                if(numero2==numero1){
                    break;
                }
                System.out.print(numero2+", ");
            }
        }
        else{
            System.out.println("são iguais!");
        }
        s.close();
    }
}
