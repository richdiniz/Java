import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] A=new int[10];
        int soma=0;
        int i=0;
        while (i<A.length) {
            System.out.print("digite um numero: ");
            A[i]=sc.nextInt();
            i++;
        }

        int primeiraP=A[0];
        int i2=0;

        while(i2<A.length){
            if(A[i2]!=primeiraP){
                soma+=A[i2];
            }
            i2++;
        }

        System.out.print("soma dos valores diferentes da primeira posição: "+soma);

        sc.close();
    }
}
