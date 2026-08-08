import java.util.Scanner;
/*Elabore um programa que leia números inteiros até que o usuário digite 0. Ao final, o programa
deve exibir quantos números pares e quantos números ímpares foram digitados.*/
public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero=0; int impar=0; int par=0;
        do {
            System.out.print("Digite um número....");
            numero=sc.nextInt();
            if (numero%2==0) {
                //System.out.println(numero+" é par!");
                par++;
            }else{
                //System.out.println(numero+" é impar!");
                impar++;
            }
        } while (numero!=0);
        System.out.println(par+" números pares "+impar+" números ímpares foram digitados");
        sc.close();
    }
}
