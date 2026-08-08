import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int fat=1;
        int n=s.nextInt();
        for (int i = 1; i <=n; i++) {
            fat*=i;
        }
        System.out.println("fatorial: "+fat);
        s.close();
    }
}
