import java.util.Scanner;
public class aq10 {
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("----------iNFORME SUA DATA DE NASCIMENTO----------");
//pessoa1 cadastro:
        System.out.println("------pessoa1");
        System.out.print("dia:");
        int dp1=input.nextInt();
        System.out.print("mês:");
        int mp1=input.nextInt();
        System.out.print("ano:");
        int ap1=input.nextInt();
//pessoa 2 cadastro:
        System.out.println("------pessoa2");
        System.out.print("dia:");
        int dp2=input.nextInt();
        System.out.print("mês:");
        int mp2=input.nextInt();
        System.out.print("ano:");
        int ap2=input.nextInt();
        //condicional:
        if (ap1==ap2) {
            if(mp1==mp2){
                if (dp1==dp2) {
                    System.out.print("mesma data!");
                }else if(dp1>dp2){
                    System.out.print("pessoa 2 é mais velha!");
                }else{
                    System.out.print("pessoa 1 é mais velha!");
                }
            }else if (mp1>mp2) {
                System.out.print("pessoa 2 é mais velha");
            }else{
                System.out.print("pessoa 1 é mais velha");
            }
        }else if (ap1>ap2) {
            System.out.print("pessoa 2 é mais velha");
        }else{
            System.out.print("pessoa 1 é mais velha");
        }
//fim:
        input.close();
    }
}
