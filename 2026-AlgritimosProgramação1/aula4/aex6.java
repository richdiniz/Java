import java.util.Scanner;

public class aex6 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int cont= 0;
        int contMaiores=0;
        while (cont>6) {
            System.out.println("nome:");
            String nome=entrada.next();
            System.out.println("idade:");
            int idade=entrada.nextInt();
            
            if(idade>17){
                System.out.println(nome+" é maior de idade");
                contMaiores= contMaiores+1;
            }else{
                System.out.println(nome+" de menor");
            }
        }
        entrada.close();
    }
}
//resolver em casa!!!