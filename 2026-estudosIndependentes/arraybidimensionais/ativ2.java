public class ativ2 {
    public static void main(String[] args) {
        System.out.println("ARRAY BIDIMENSIONAL:");
        System.out.println("----------------------");

        int[][] matriz=new int[2][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }     
    }
}
