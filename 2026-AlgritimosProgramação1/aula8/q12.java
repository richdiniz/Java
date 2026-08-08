import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num, somaNum=0, rept=0;

        
        do{
            System.out.print("numero positivo: ");
            num=sc.nextInt();
            somaNum+=num;
            rept++;
            if (num<0) {
                break;
            }
            
        }while(somaNum<101);
        System.out.println("quantos números foram digitados? "+rept);
        System.out.println("total final? "+somaNum);
        sc.close();
    }
}
