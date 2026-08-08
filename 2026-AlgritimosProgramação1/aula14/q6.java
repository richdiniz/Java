public class q6 {
    public static void main(String[] args) {
        int[] vetor= new int[10];
        int numero=10; long produto=1;

        for (int i = 0; i <10; i++) {
            vetor[i]=numero;
            numero+=5;
            System.out.println((i+1)+")"+vetor[i]);
        }

        //ache o produto:
        for (int i = 0; i <10; i++) {
            produto=produto*vetor[i];
        }
        System.out.println("produto: "+produto);
    }
}