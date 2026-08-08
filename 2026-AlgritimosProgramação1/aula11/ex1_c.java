import java.util.Scanner;

public class ex1_c{

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] numeros=new int [5];
    int i = 0;
    while(i < numeros.length){
        System.out.print("Digite o valor da posição [" + i + "]: ");
        numeros[i] = sc.nextInt();
        i++;
    }
    i=0;
    while (i<numeros.length) {
            System.out.println("valor:"+numeros[i]);
            i++;
        }
        sc.close();
    }
}