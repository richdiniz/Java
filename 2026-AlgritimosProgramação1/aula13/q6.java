import java.util.Random;

public class q6 {
    public static void main(String[] args) {
        Random random=new Random();
        int[][] matriz= new int[10][10];


        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j]=random.nextInt(100);
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
int contN=0;
        for(int i = 0; i < 10; i++){
            int menor =  matriz[i][0];// assume o primeiro como menor
            for (int j = 1; j < 10; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }

                if (matriz[i][j]<0){
                    contN++;
                }
            }
            System.out.println("-Menor elemento da linha " + i + ": " + menor);
        }
        System.out.println("--qt de elementos negativos:"+contN);
        for(int i=0; i<10; i++){
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("---"+matriz[i][j]+", endereço:["+i+"]["+j+"].");
            }
        }
    }
}