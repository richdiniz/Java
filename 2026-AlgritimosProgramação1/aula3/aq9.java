import java.util.Scanner;
/*Escreva um algoritmo que leia três números e apresente uma das suas mensagens a seguir:
- “Todos os números são diferentes a zero” ou “Nem todos os números são diferentes de zero”.
- Se nem todos os números forem diferentes de zero, informe quantos números digitados são iguais
a zero.
- Caso todos os números sejam diferentes de zero, calcular o resultado a ser apresentado para o
usuário da seguinte forma:
■ Se todos os números forem positivos: o resultado é o produto dos números;
■ Se pelo menos um número for positivo: o resultado é a soma dos números;
■ Se todos os números forem negativos: o resultado é a média dos números.*/
public class aq9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = entrada.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = entrada.nextInt();
        int zeros = 0;

        if(n1 == 0){zeros = zeros + 1;}
        if(n2 == 0){zeros = zeros + 1;}
        if(n3 == 0){zeros = zeros + 1;}
        if(zeros == 0){
            System.out.println("Todos os números são diferentes de zero");
            if (n1 > 0 && n2 > 0 && n3 > 0){
                int produto = n1 * n2 * n3;
                System.out.println("Produto: " + produto);
            }else if(n1 < 0 && n2 < 0 && n3 < 0) {
                double media = (n1 + n2 + n3) / 3.0;
                System.out.println("Média: " + media);
            }else{
                int soma = n1 + n2 + n3;
                System.out.println("Soma: " + soma);
            }}
            else{
            System.out.println("Nem todos os números são diferentes de zero");
            System.out.println("Quantidade de números iguais a zero: " + zeros);
        }
        entrada.close();
    }
}