import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=0, r=0, ti=0;
        System.out.print("Termo Inicial: ");
        ti=s.nextLong();
        System.out.print("Razão: ");
        r=s.nextLong();
        System.out.print("n-ésimo termo: ");
        n=s.nextLong();
        for(long i = 0; i <n; i++){
            System.out.print(ti+", ");
             ti=ti+r;
        }
        s.close();
    }
}
