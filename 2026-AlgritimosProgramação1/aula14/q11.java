public class q11 {
    public static void main(String[] args) {
        int totalTermos = 30;
        double soma = 0.0;
        
        // Valores iniciais do primeiro termo
        double numerador = 480.0;
        double denominador = 10.0;

        for (int i = 1; i <= totalTermos; i++) {
            // Calcula o valor absoluto do termo atual
            double termo = numerador / denominador;

            // Se a posição do termo for par, ele subtrai. Se for ímpar, soma.
            if (i % 2 == 0) {
                soma -= termo;
            } else {
                soma += termo;
            }

            // Atualiza os valores para o próximo termo da série
            numerador -= 5;
            denominador += 1;
        }

        // Exibe o resultado formatado com 2 casas decimais
        System.out.printf("A soma dos %d primeiros termos é: %.2f%n", totalTermos, soma);
    }
}
