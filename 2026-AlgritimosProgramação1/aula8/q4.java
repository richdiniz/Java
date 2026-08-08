import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double valorCompra=0, media, repeticoes=0;
        int arrecadado=0;
        do{
            System.out.print("valor da compra: ");
            valorCompra=sc.nextDouble();
            if(valorCompra==0){
                break;
            }
            arrecadado+=valorCompra;
            repeticoes++;
        }while(!(valorCompra==0));
        media=arrecadado/repeticoes;
        System.out.println("total arrecadado no dia: "+arrecadado);
        System.out.println("media de gasto por clientes: "+media);
        sc.close();
    }
}
