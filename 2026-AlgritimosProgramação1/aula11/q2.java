import java.util.Random;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] a= new int[5];
        Random rand=new Random();
        int i=0;
        while (i<a.length) {
            a[i]=rand.nextInt(100);
            System.out.println(a[i]+" ");
            i++;
        }
        System.out.print("digite umm valor para ver se aparece: ");
        int num=sc.nextInt();
        int cont=0;
        while (i<a.length) {
            if (a[i]==num) {
                cont++;
            }
            i++;
        }
        if (cont>0) {
            System.out.println("N numero aparece "+cont);
        }else{
            System.out.println("não encvontrado!");
        }
        sc.close();
    }
}
