import java.util.Scanner;

public class q6 {
    /*A população de uma cidade cresce aproximadamente 10% ao ano. Faça um programa que leia o
ano atual e qual a população da cidade hoje e apresente qual é a população estimada para cada
ano até 2050.
Utilize a instrução while para resolver o problema.
Por exemplo, se o ano atual for 2023 e a população hoje for 1000:
2023 - 1000.00
2024 – 1100.00
2025 – 1210.00
... até 2050.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double porct=0;

        System.out.print("Em que ano estamos? ");
        int ano_atual=sc.nextInt();
        System.out.print("Qual a população da cidade hoje? ");
        double pop=sc.nextDouble();

        while(ano_atual<=2050){
            porct=(pop*10)/100;
            pop=pop+porct;
            System.out.println(ano_atual+") população atual: "+(pop-porct));
            ano_atual++;
        }
        sc.close();
    }
}
//ler pra entender...