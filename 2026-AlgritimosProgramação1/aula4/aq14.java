import java.util.Scanner;
/*Você precisa implementar um programa que leia duas notas de 30 pessoas, calcule e, para cada
uma delas:
● informe se as notas digitadas são válidas ou inválidas, ou seja, estão entre 0 e 10;
● se forem válidas:
○ apresente a média;
○ Informe se a pessoa foi classificada (media >= 6.0) ou desclassificada.
*/
public class aq14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;

        while (contador <= 30) {
            System.out.println("Pessoa " + contador);
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();
            
        // Verificação de validade das notas
            if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10){
                System.out.println("Notas válidas.");
                double media = (nota1 + nota2) / 2;
                System.out.println("Média: " + media);

                if (media >= 6.0) {
                    System.out.println("Pessoa classificada.");
                } else {
                    System.out.println("Pessoa desclassificada.");
                }
            }else {
                System.out.println("Notas inválidas.");
            }
            System.out.println(); // linha em branco
            contador++;
        }
        scanner.close();
    }
}