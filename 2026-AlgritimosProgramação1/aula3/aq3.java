import java.util.Scanner;
/*Ler três valores e um código de condição. Se o código for “c” os valores devem ser escritos em ordem
crescente. Se o código for “d”, deve-se escrevê-los em ordem decrescente. */
public class aq3 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("valor: ");
        int v1=entrada.nextInt();
        System.out.print("valor: ");
        int v2=entrada.nextInt();
        System.out.print("valor: ");
        int v3=entrada.nextInt();
        System.out.print("c ou d? escolha um.");
        String r = entrada.next();//precisa limpar o bufer, por isso usar [next()] ao invês de [nextLine()], por causa dos "nextInt".
        if (r.equalsIgnoreCase("c")) {
            if (v1<=v2 && v2<=v3) {
                System.out.print(v1+", "+v2+", "+v3);
            } else if (v1<=v2 && v2>=v3) {
                System.out.print(v1+", "+v3+", "+v2);
            } else if (v2>=v3 && v1>=v2) {
                System.out.print(v3+", "+v2+", "+v1);
            }
        }
        else if (r.equalsIgnoreCase("d")){
            if (v1<=v2 && v2<=v3) {
                 System.out.print(v3+", "+v2+", "+v1);
            }else if (v1<=v2 && v2>=v3) {
                System.out.print(v2+", "+v3+", "+v1);
            }else if (v2>=v3 && v1>=v2) {
                 System.out.print(v1+", "+v2+", "+v3);
            }
        }
      
        entrada.close();
    }
}