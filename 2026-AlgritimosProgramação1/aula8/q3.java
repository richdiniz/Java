import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, negativo=0, positivo=0;
        do{
            System.out.print("digite algum número inteiro: ");
            n=sc.nextInt();
            if(n<0){
                negativo++;
            }else if(n>0){
                positivo++;
            }
        }while(n!=0);
        System.out.println("Quantidade de números positivos: "+positivo);
        System.out.println("Quantidade de números neegativos: "+negativo);
        sc.close();
    }
}
