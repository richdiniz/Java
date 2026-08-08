import java.util.Scanner;
/* Dados três valores A, B e C, verificar e informar se eles podem ser os comprimentos dos lados de um
triângulo e, se forem, verificar se compõem um triângulo equilátero, isósceles ou escaleno, sendo que:
- Triângulo é uma figura geométrica de três lados, onde cada lado é menor do que a soma dos
outros dois.
- Triângulo equilátero: três lados iguais.
- Triângulo isósceles: dois lados iguais.
- Triângulo escaleno: todos os lados diferentes. */
public class aq1 {
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    System.out.print("lado 1:");
    float l1=entrada.nextFloat();
    System.out.print("lado 2:");
    float l2=entrada.nextFloat();
    System.out.print("lado 3:");
    float l3=entrada.nextFloat();
    if (l1==l2 && l1==l3) {
        System.out.print("Equilátero, 3 lados iguais.");
    }else{
        if (l1==l3 || l1==l2 || l2==l3) {
            System.out.print("Isósceles, 2 lados iguais.");
        }else{
            System.out.print("Escaleno, todos os lados diferentes.");
        }
    }
    entrada.close();
    }
}
