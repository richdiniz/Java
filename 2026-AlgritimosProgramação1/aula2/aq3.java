import java.util.Scanner;

public class aq3{
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.print("um número...");
         float n1= input.nextFloat();
         System.out.print("um número...");
         float n2= input.nextFloat();
         float div=(n1/n2);
         if(n2==0){
            System.out.println("não se pode fazer divisão por zero!");
         }else if (n1==0) {
            System.out.println("resultsdo= "+div);
         }else{
            System.out.println("resultado= "+div);
         }
         input.close();
    }
}