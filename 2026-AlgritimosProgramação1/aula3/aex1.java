import java.util.Scanner;

public class aex1 {
    public static void main(String[] args) {
        Scanner dado= new Scanner(System.in);
        System.out.print("Idade: ");
        int idade=dado.nextInt();
        dado.nextLine();
        System.out.print("Sexo (m/f):");
        String sexo=dado.nextLine();
        if (sexo.equalsIgnoreCase("m")&& idade>=18){
            //nomeDaVariavel.equalsIgnoreCase("X") --> comparar com letra.
            System.out.println("Deve se alistar!");
        }else{
            System.out.print("Não deve se alistar!");
        }
        dado.close();
    }
}