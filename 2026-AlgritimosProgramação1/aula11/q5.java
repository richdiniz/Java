import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] vetorA= new int[10];
        int i=0,repeticao=0;

        while(i<vetorA.length){
            System.out.print("digite um numero: ");
            vetorA[i]=sc.nextInt();

            if (i>0 && vetorA[0]==vetorA[i]) {
                repeticao++;
            }

            i++;
        }
            System.out.println("vezes q o primeiro elementoaparece no vetor:"+(repeticao+1));
        sc.close();
    }
}
