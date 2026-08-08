import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] vetor=new int[5];
        int i=0; int p_maior=0;

        while (i<vetor.length){
            System.out.print(i+")digite um número: ");
            vetor[i]=sc.nextInt();
            
            if(i>0 && vetor[i]==vetor[i-1]){
                System.out.println("repetido!");
                break;
            }

            if(vetor[i]%2==0){
                System.out.println("--posição:"+i);
            }

            if(i>0 && vetor[i]>vetor[i-1]){
                p_maior=i;
            }
            i++;
        }
        System.out.println("---posição do maior elemento do vetor "+p_maior);

        sc.close();
    }
}
