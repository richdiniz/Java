import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] V=new int[10];
        int i=0; int valor=3;

        while(i<V.length){
            System.out.print("digite um numero: ");
            V[i]=sc.nextInt();
            i++;
        }

        int i2=0;
        while(i2<V.length){
            if(i2%2==0){
                V[i2]=5;
            }else{
                V[i2]=valor;
                valor+=3;
            }
            i2++;
        }

        int i3=0;
        while (i3<V.length){
            System.out.println(i3+") valor desta posição: "+V[i3]);
            i3++;
        }
        sc.close();
    }
}