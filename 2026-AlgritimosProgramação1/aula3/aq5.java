import java.util.Scanner;
/*Elabore um programa que a partir da idade e do peso do paciente calcule e informe quantas gotas de
um medicamento o paciente deverá tomar por dose.
- Pessoas a partir de 12 anos: se tiverem peso igual ou inferior a 60 quilos devem tomar 30 gotas;
com peso superior a 60 quilos devem tomar 40 gotas.
- Para crianças abaixo de 12 anos a dosagem é calculada pelo peso corpóreo conforme a tabela a
seguir:
*/
public class aq5 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("informe seu peso:");
        double peso=entrada.nextDouble();
        System.out.print("informe sua idade:");
        double idade=entrada.nextDouble();
        if(idade>=12 && peso<=60){
            System.out.println("Deve tomar 30 gotas");
        }else if(idade>=12 && peso>60){
            System.out.println("Deve tomr 40 gotas");
        }else{
            if (peso<=10) {
                System.out.println("Deve tomr 5 gotas");
            }else if (peso<=20) {
                System.out.println("Deve tomr 10 gotas");
            }else if (peso<=30) {
                System.out.println("Deve tomr 15 gotas");
            }else{
                System.out.println("Deve tomr 20 gotas");
            }
        }
        entrada.close();
    }
}
