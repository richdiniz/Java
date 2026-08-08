import java.util.Scanner;
/*O sistema de trânsito da sua cidade o contratou para realizar o controle das multas aplicadas em
uma avenida. Para isso, escreva um programa que:
● leia, inicialmente, a velocidade máxima permitida;
● leia a placa, se é uma ambulância (sim ou não) e a velocidade de 20 carros que passaram
por um radar posicionado na avenida;
● calcule e apresente, para cada carro:
○ caso o motorista esteja dentro da velocidade permitida, apresente a mensagem
“Motorista está dentro da velocidade permitida!”;
○ caso contrário, apresente a mensagem “Motorista ultrapassou a velocidade
máxima”, calcule e imprima o valor da multa a ser paga por esse motorista. Sendo
que são pagos R$ 10,00 para cada quilômetro que ultrapasse a velocidade máxima.
■ *Neste caso, se o tipo do carro for ambulância, não deve ser calculada multa, mas
deve-se informar ao usuário que o carro está acima da velocidades máxima, mas
que não pagará multa.
● calcule e apresente ao final:
○ o percentual de motoristas que não foram multados;
○ o valor total arrecadado com multas;
○ o valor da maior multa e a placa do carro que levou esta multa, considerando que
não houve empate.
*/
public class aq11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
    int i=0;
    int v_maxima=0;
    int v_do_carro=0; String placa_carro=""; String resposta="";
    int multa=0;

    int somamulta=0;
    int MNM=0;
    int maior_multa=-1;
    String placa_maior_multa="";

        System.out.print("Velocidade máxima permitida(km/h): ");
        v_maxima=sc.nextInt();

        while (i<20){
            System.out.print("Placa: ");
            placa_carro=sc.next();
            System.out.print("velocidade desse carro(km/h):");
            v_do_carro=sc.nextInt();
            System.out.print("É ambulância(S/N)? ");
            resposta=sc.next();

            multa=(v_do_carro-v_maxima)*10;

            if(v_do_carro<=v_maxima){
                System.out.println("-Motorista está dentro da velocidade permitida!");
                System.out.println("____________________________________________________");
                MNM++;
            }else{
                System.out.println("-Motorista ultrapassou a velocidade máxima!");
                if (resposta.equalsIgnoreCase("S")) {
                    multa=0;
                    System.out.println("-O carro está acima da velocidades máxima, mas não pagará multa.");
                    System.out.println("____________________________________________________");
                    MNM++;
                }else{
                    System.out.println("-Dono do "+placa_carro+", valor da multa a ser paga: "+multa+".");
                    System.out.println("____________________________________________________");
                    somamulta+=multa;
                    if(multa>maior_multa){
                        maior_multa=multa;
                        placa_maior_multa=placa_carro;
                    }
                }
            }
            i++;
        }
        double p_MNM=(MNM*100.0)/i;
        System.out.println("PERCENTUAL DOS MOTORISTAS NÃO MULTADOS: "+p_MNM+"%");
        System.out.println("VALOR ARRECADADO R$"+somamulta);
        System.out.println("o valor da maior multa "+maior_multa+", e a placa do carro que levou esta multa: "+placa_maior_multa);
        sc.close();
    }
}