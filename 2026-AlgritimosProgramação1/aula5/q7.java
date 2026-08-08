import java.util.Scanner;

public class q7 {
    /*Leia o voto de 10 eleitores para candidatos A, B ou C. Mostre a quantidade
de votos de cada candidato e o vencedor.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int votosA = 0;
        int votosB = 0;
        int votosC = 0;

        int cont= 1;

        while (cont<= 10) {
            System.out.print("Digite o voto do eleitor "+cont+" (A, B ou C): ");
            String voto = sc.next().toUpperCase();

            if (voto.equals("A")) {
                votosA++;
                cont++;
            } 
            else if (voto.equals("B")) {
                votosB++;
                cont++;
            } 
            else if (voto.equals("C")) {
                votosC++;
                cont++;
            } 
            else {
                System.out.println("Voto inválido. Digite apenas A, B ou C.");
            }
        }

        System.out.println("\nQuantidade de votos:");
        System.out.println("Candidato A: " + votosA);
        System.out.println("Candidato B: " + votosB);
        System.out.println("Candidato C: " + votosC);

        // Verificar vencedor
        if (votosA > votosB && votosA > votosC) {
            System.out.println("Vencedor: Candidato A");
        } 
        else if (votosB > votosA && votosB > votosC) {
            System.out.println("Vencedor: Candidato B");
        } 
        else if (votosC > votosA && votosC > votosB) {
            System.out.println("Vencedor: Candidato C");
        } 
        else {
            System.out.println("Houve empate.");
        }

        sc.close();
    }
}
