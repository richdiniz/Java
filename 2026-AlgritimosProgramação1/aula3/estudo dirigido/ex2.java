import java.util.Scanner;
/*Exercício 2 – Entrada em Evento*/
public class ex2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("idade: ");
        double idade= entrada.nextDouble();
        System.out.print("está acompanhado (sim/não): ");
        String resposta= entrada.next();
        entrada.close();
        if (idade>=18 || (idade>=16 && resposta.equalsIgnoreCase("sim"))){
            System.out.print("Permitir entrada...");
        } else{
            System.out.print("Negado!");
        }
    }
}
