import java.util.Scanner;
/*Suponha que você é responsável por desenvolver um programa que calcule o IMC (Índice de Massa
Corporal) de uma pessoa a partir do seu peso e altura. O programa deve apresentar o resultado do
cálculo e informar a categoria em que a pessoa se encontra de acordo com a tabela abaixo:*/
public class aq11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu peso (kg): ");
        double peso = entrada.nextDouble();
        System.out.print("Digite sua altura (m): ");
        double altura = entrada.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Situação: Abaixo do peso");
        } else if(imc <= 24.9){
            System.out.println("Situação: Peso normal");
        } else if(imc <= 29.9){
            System.out.println("Situação: Sobrepeso");
        } else if(imc <= 34.9){
            System.out.println("Situação: Obesidade grau 1");
        } else if(imc <= 39.9){
            System.out.println("Situação: Obesidade grau 2");
        } else{
            System.out.println("Situação: Obesidade grau 3");
        }
        entrada.close();
    }
}