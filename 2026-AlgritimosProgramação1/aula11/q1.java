import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] idades= new int[10];
        int i=0;

        while (i<idades.length) {
            System.out.println("idade: ");
            idades[i]=sc.nextInt();
            i++;
        }

        int maior=idades[0];
        i=0;
        while (i<idades.length) {
            if (idades[i]>maior) {
                maior=idades[i];
            }
            i++;
        }
        
        int qt=0;
        i=0;
        while (i<idades.length) {
            if (idades[i]==maior) {
                qt++;
            }
            i++;
        }

        System.out.println("maior idade é "+maior);
        System.out.println("qt pessoas com a maor idade "+qt);

        sc.close();
    }
}
/*
int[] idade=new int[10];
        int i=0;
        while (i>10){
            System.out.println("digite sua idade:");
            idade[i]=sc.nextInt();
            i++;
        }
*/