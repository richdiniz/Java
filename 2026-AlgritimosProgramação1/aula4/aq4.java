import java.util.Scanner;
/*Faça um programa que leia a quantidade de pessoas que assistiram uma apresentação de dança em um teatro. Depois, para cada uma das pessoas, pergunte se ela gostou da apresentação (“sim” ou “não”) e, ao final, informe se a maioria das pessoas gostou da apresentação, se a maioria não gostou da apresentação ou se deu empate.*/
public class aq4{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int i=0;
    int n_pessoas=0;
    String resposta="";
    int r_S=0;
    int r_N=0;

//dado de entrada par saber quantas vezes repetir o programa.
    System.out.println("Número de pessoas que assistiram a apresentação de dança no teatro: ");
    n_pessoas=sc.nextInt();

//laço de repetição. 
        while (i<n_pessoas) {
            System.out.println("Gostou da apresentação?");
            resposta=sc.next();
            if (resposta.contentEquals("sim")){
                r_S++;
            }
            else{
                r_N++;
            }
            i++;
        }
//verificação para qual foi maior
        if (r_S>r_N) {
            System.out.println("---A mioria gostou!"+r_S+"/"+i);
        }else{
            System.out.println("---A mioria não gostou!"+r_N+"/"+i);
        }
    sc.close();
    }
}