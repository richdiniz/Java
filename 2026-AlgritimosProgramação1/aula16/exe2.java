import java.util.Scanner;

public class exe2{
    public static int somar(int a, int b) {
        System.out.println("Bem vindo!");
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("n1: ");
        int n1=sc.nextInt();
        System.out.println("n2: ");
        int n2=sc.nextInt();
        //int res=somar(5, 3);
        int res=somar(n1,n2);
        System.out.println(res);
        sc.close();
    }
}