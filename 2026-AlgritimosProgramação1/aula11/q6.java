import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] vetorA= new int[10];
        int i=0;//para usar um laço de repetição.
        int repeticao=0;//contar as repetições.

        while(i<vetorA.length){
            System.out.print(i+")digite um numero: ");
            vetorA[i]=sc.nextInt();
            i++;
        }

        int ultimo=vetorA[vetorA.length-1];

        int i2=0;//para usar um novo laço de repetição com DO WHILE...
        do{
            if(vetorA[i2]==ultimo){
                repeticao++;
            }
            i2++;
        }while(i2<vetorA.length);

        //Resposta à ser imprimida: 
        System.out.println("quantia de vezes q o ultimo elemento aparece no vetor:"+repeticao);
        sc.close();
    }
}