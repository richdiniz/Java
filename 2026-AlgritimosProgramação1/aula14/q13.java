import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fat=1, n;
        System.out.print("numero:");
        n=sc.nextInt();
        for (int i = 1; i<=n; i++) {
            fat*=i;
        }
        System.out.println("fatorial do número "+n+": "+fat);
        sc.close();
    }
}
