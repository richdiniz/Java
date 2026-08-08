public class desafio4 {
    public static void main(String[] args) {
        int[] numeros = {999, 50, 900, 77};
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println("Soma total: " + soma);
    }
}
