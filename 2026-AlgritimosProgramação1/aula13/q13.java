import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 2;

        double [][] produto = new double[n][2];
        double [] total = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Código: "+i);

            System.out.println("Quantidade: ");
            produto[i][0] = sc.nextDouble();

            System.out.println("Preço: ");
            produto[i][1] = sc.nextDouble();
        }

        double barato = produto[0][1];
        int codBarato = 0;

        for (int i = 0; i < n; i++){
            if (produto[i][1] < barato){
                barato = produto[i][1];
                codBarato = i;
            }
        }

        System.out.println("\nProduto mais barato: ");
        System.out.println("Código: "+ codBarato);
        System.out.println("Valor: "+ barato);

        for (int i = 0; i < n; i++){
            total[i] = produto[i][0] * produto[i][1];
        }

        System.out.println("Valor total por produto: ");
        for (int i = 0; i < n; i++){
            System.out.println("Código: "+i+": "+total[i]);
        }
        sc.close();
    }
}
