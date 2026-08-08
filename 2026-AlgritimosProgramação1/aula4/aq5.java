import java.util.Scanner;
/*5. Construa um programa que permita fazer um levantamento do estoque de vinhos de uma adega, que possui 50 garrafas, tendo como dados de entrada o tipo de cada vinho (B - Branco, T - Tinto e R - Rosé). O programa deve fazer a leitura e especificar a porcentagem de cada tipo de vinho. 
Exemplo: 
● Percentual de vinho branco: 40.0 
● Percentual de vinho tinto: 20.0 
● Percentual de vinho rosê: 40.0
*/
public class aq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 50;
        int contador = 0;
        int branco = 0;
        int tinto = 0;
        int rose = 0;

        while (contador < total) {
            System.out.print("Digite o tipo do vinho (B - Branco, T - Tinto, R - Rosé): ");
            String tipo = sc.nextLine().toUpperCase();

            if (tipo.equals("B")) {
                branco++;
            } else if (tipo.equals("T")) {
                tinto++;
            } else if (tipo.equals("R")) {
                rose++;
            } else {
                System.out.println("Entrada inválida. Digite apenas B, T ou R.");
                continue; // não conta dado inválido
            }

            contador++;
        }

        double percBranco = (branco * 100.0) / total;
        double percTinto = (tinto * 100.0) / total;
        double percRose = (rose * 100.0) / total;

        System.out.println("\nResultados:");
        System.out.println("Percentual de vinho branco: " + percBranco);
        System.out.println("Percentual de vinho tinto: " + percTinto);
        System.out.println("Percentual de vinho rosé: " + percRose);

        sc.close();
    }
}