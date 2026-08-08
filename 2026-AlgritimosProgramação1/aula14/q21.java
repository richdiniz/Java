import java.util.Scanner;

public class q21{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=0;
        System.out.print("X:");
        int x=s.nextInt();
        System.out.print("Y:");
        int y=s.nextInt();
        int z=x;
        for (int i = 1; i <y; i++) {
            n=x*z;
            x=n;
        }
        System.out.println("resultado: "+n);
        s.close();
    }
}
