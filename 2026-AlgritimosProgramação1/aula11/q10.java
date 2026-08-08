import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[5];
        int[] b= new int[5];
        int[] c=new int[5];

        int i=0;
        while (i<a.length) {
            System.out.print("A)Digite o valor da posição [" + i + "]: ");
            a[i] = sc.nextInt();
            i++;
        }
        i=0;
        while (i<b.length) {
            System.out.print("B)Digite o valor da posição [" + i + "]: ");
            b[i]=sc.nextInt();
            i++;
        }
        i=0;
        while (i<c.length) {
            c[i]=(a[i]-b[i]);
            i++;
        }
        int i2=0;
        while (i2<c.length) {
            System.out.println("----valor da diferença é "+c[i2]+", na posição ("+i2+")");
            i2++;
        }
        sc.close();

    }
}
