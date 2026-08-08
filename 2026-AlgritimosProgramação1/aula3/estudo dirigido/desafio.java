import java.util.Scanner;

public class desafio{
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite a idade: ");
    int idade= entrada.nextInt();
    System.out.print("Digite o sexo (m/f): ");
    String sexo= entrada.next();
    System.out.print("Digite o estado civil (solteiro/casado): ");
    String estadoCivil= entrada.next();

        if((idade>= 18 && idade<= 30)&&(sexo.equalsIgnoreCase("f") || estadoCivil.equalsIgnoreCase("solteiro"))){
            // idade é verificado primeiro, depois sexo ou estado civil.
           System.out.println("Perfil aceito.");
        } else {
            System.out.println("Perfil não aceito.");
        }
        entrada.close();
    }
}