import java.util.Scanner;
/*Faça um programa que leia o número de andares de um prédio e, considerando que,
inicialmente, o elevador está no térreo (andar zero) e vazio, na subida, para cada andar do
prédio, leia o número de pessoas que saíram e entraram do elevador e informe quantas pessoas
estão subindo para o próximo.
Se o número de pessoas, após a entrada e saída, for maior que 15, deve ser mostrada a
mensagem “Excesso De Passageiros. Devem sair" em seguida, o número de pessoas que devem
sair do elevador, de modo que seja obedecido o limite de 15 passageiros. Nesse caso,
considerem que as pessoas excedentes sairão.
Após a saída e entrada de pessoas no último andar o programa deve mostrar quantas pessoas
irão descer.
● Precisa representar apenas os dados se referem a uma “subida” do elevador;
Considere que o número de pessoas dentro do elevador sempre será maior ou igual a 0, não
precisando validar.
*/
public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int andares;
        int pessoas = 0;

        System.out.print("Digite o número de andares do prédio: ");
        andares = scanner.nextInt();

        for (int andar = 1; andar <= andares; andar++) {

            System.out.println("\nAndar " + andar);

            System.out.print("Pessoas que saíram: ");
            int sairam = scanner.nextInt();

            System.out.print("Pessoas que entraram: ");
            int entraram = scanner.nextInt();

            // Atualiza quantidade
            pessoas = pessoas - sairam + entraram;

            // Verifica excesso
            if (pessoas > 15) {

                int excesso = pessoas - 15;

                System.out.println(
                    "Excesso De Passageiros. Devem sair "
                    + excesso
                );

                pessoas = 15;
            }

            // Se não for o último andar
            if (andar < andares) {
                System.out.println(
                    "Pessoas subindo para o próximo: "
                    + pessoas
                );
            }
        }

        // Último andar
        System.out.println(
            "\nNo último andar, "
            + pessoas
            + " pessoas irão descer."
        );

        scanner.close();
    }
}
//ler pra entender...