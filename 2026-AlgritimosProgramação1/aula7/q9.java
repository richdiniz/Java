import java.util.Scanner;
/*A comissão organizadora de um rallye automobilístico decidiu apurar os resultados da
competição através de um processamento eletrônico. Um dos programas necessários para a
classificação das equipes concorrentes é o que emite uma listagem geral do desempenho das
equipes, atribuindo pontos segundo determinadas normas. Esse programa deverá
● Ler:
a. Inicialmente, os tempos-padrão (em minutos decimais) para as três fases de
competição;
b. para cada equipe, o número de inscrição da equipe e os tempos (em minutos
decimais) que as mesmas levaram para cumprir as três diferentes etapas. A última
linha (flag), que não entrará nos cálculos, contém o número 9999 como número de
inscrição.
● Calcular:
a. os pontos de cada equipe em cada uma das etapas, seguindo o seguinte critério: Seja
Δ o valor absoluto da diferença entre o tempo-padrão (lido na primeira linha) e o
tempo despendido pela equipe numa etapa:
i. Δ < 3 minutos – atribuir 100 pontos à etapa
ii. 3 <= Δ <= 5 minutos – atribuir 80 pontos à etapa
iii. Δ > 5 minutos – atribuir 80 – (Δ - 5)/5 pontos à etapa
b. o total de pontos de cada equipe nas três etapas;
c. a número de inscrição da equipe vencedora.
*/
public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          double padrao1, padrao2, padrao3;

        // Ler tempos padrão
        System.out.print("Tempo padrão etapa 1: ");
        padrao1 = sc.nextDouble();

        System.out.print("Tempo padrão etapa 2: ");
        padrao2 = sc.nextDouble();

        System.out.print("Tempo padrão etapa 3: ");
        padrao3 = sc.nextDouble();

        int numeroEquipe;
        int equipeVencedora = 0;
        double maiorPontuacao = -1;

        System.out.print("\nNúmero da equipe (9999 para encerrar): ");
        numeroEquipe = sc.nextInt();

        while (numeroEquipe != 9999) {

            double tempo1, tempo2, tempo3;

            System.out.print("Tempo etapa 1: ");
            tempo1 = sc.nextDouble();

            System.out.print("Tempo etapa 2: ");
            tempo2 = sc.nextDouble();

            System.out.print("Tempo etapa 3: ");
            tempo3 = sc.nextDouble();

            // Calcular pontos das etapas
            double pontos1 = calcularPontos(padrao1, tempo1);
            double pontos2 = calcularPontos(padrao2, tempo2);
            double pontos3 = calcularPontos(padrao3, tempo3);

            double total = pontos1 + pontos2 + pontos3;

            System.out.println("Total de pontos da equipe: " + total);

            // Verificar vencedor
            if (total > maiorPontuacao) {
                maiorPontuacao = total;
                equipeVencedora = numeroEquipe;
            }

            System.out.print("\nNúmero da equipe (9999 para encerrar): ");
            numeroEquipe = sc.nextInt();
        }

        System.out.println("\nEquipe vencedora: " + equipeVencedora);
        System.out.println("Pontuação: " + maiorPontuacao);

        sc.close();
    }

    // Função para calcular pontos
    public static double calcularPontos(double padrao, double tempo) {

        double delta = Math.abs(padrao - tempo);
        double pontos;

        if (delta < 3) {
            pontos = 100;
        }
        else if (delta <= 5) {
            pontos = 80;
        }
        else {
            pontos = 80 - (delta - 5) / 5;
        }

        return pontos;
    }
}
//ler pra entender...