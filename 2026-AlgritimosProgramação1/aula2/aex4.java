import java.util.Scanner;
public class aex4{
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("digite sua idade... ");
        int id=entrada.nextInt();
        if (id<=10){System.out.println("classe A");}
        else if(id>=11 && id<21){System.out.println("classe B");}
        else if (id>=21 && id<31){System.out.println("classe C");}
        else if(id>=31 && id<41){System.out.println("classe D");}
        else{System.out.println("classe E");}
        System.out.print("Fim");
        entrada.close();
    }
}

