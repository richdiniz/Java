import java.util.Scanner;
//--->professor
public class aq5 {
    public static void main(String[] args) {
        Scanner entra= new Scanner(System.in);
        System.out.print("entre com número:");
        int n1 = entra.nextInt();
        System.out.print("entre com outro número:");
        int n2 = entra.nextInt();
        System.out.println("escolha digitar C ou D");
        char codigo_CD=entra.next().charAt(0);//----para entrar com Alfanúméricos
        //estrutura de decissão:
        if (codigo_CD=='c') {
            if (n1<=n2) {
                System.out.println(n1+""+n2);
            }else{
                System.out.println(n2+" "+n1);
            }
        }else if (codigo_CD=='d'){
            if (n1>=n2){
                System.out.println(n1+""+n2);
            }else{
                System.out.println(n2+" "+n1);
            }
        }else{
            System.out.println("invalido");
        }
        entra.close();
    }
}