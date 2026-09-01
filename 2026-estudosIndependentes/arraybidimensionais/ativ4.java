/*
ARRAY COM CAMPO PARA A ENTRADA.
*/
import java.util.Scanner;

public class ativ4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String [][]array= new String[2][3];
        System.out.println("Preencha com nomes:");
        System.out.println("----------------");
        int contN=1;
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(contN+"° Nome:");
                array[i][j]=s.nextLine();
                contN++;
            }
        }
        s.close();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("\t"+array[i][j]);
            }
            System.out.println();
        }
    }
}
