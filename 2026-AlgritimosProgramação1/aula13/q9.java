import java.util.Scanner;

public class q9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [][]m= new int[3][4];
        int[] v0= new int[3];
        int[] v1= new int[4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("digite: ");
                m[i][j]=sc.nextInt();
            }
        }
sc.close();

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print("|"+m[i][j]);
            }
            System.out.println();
        }

        for(int i=0; i<1;i++){
            System.out.println("---elementos da linha 0 da matriz: ");
            for(int j=0; j<4;j++){
                v1[j]=m[0][j];
                System.out.print(v1[j]+",");
            }
            System.out.println();
        }
int i=0;
System.out.println("---elementos da coluna 1 da matriz: ");
        for(i=0; i<3; i++){
            v0[i]=m[i][1];
            System.out.print(v0[i]+";");
        }
        
       
       
        }
    }