public class q15 {
    public static void main(String[] args){
                int[][] A = new int[100][50];

        // preenchendo a matriz
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 50; j++) {

                A[i][j] = i + j;

            }
        }

        // imprimindo a matriz
        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < 50; j++) {

                System.out.print(A[i][j] + "\t");

            }

            System.out.println();
        }

    }
}
