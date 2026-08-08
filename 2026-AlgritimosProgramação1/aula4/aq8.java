import java.util.Scanner;
/*Os candidatos a uma vaga de emprego fizeram um teste de aptidão. Para cada candidato foi preenchida uma ficha com os seguintes dados: nome e quantidade de questões que acertou. Faça um programa que, inicialmente, leia o valor das questões e, na sequência, leia os dados de 5 candidatos, calcule e informe: 
● o nome e a nota de cada candidato; 
● a média das notas dos candidatos; 
● a maior nota.
*/
public class aq8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        float vq=0;
        String nome="";
        float qqa=0;
        float nota=0;
        float notas_Somadadas=0;
        float media=0;
        float maior_nota=-999;
        String nomeMaiorNota="";

        System.out.print("Valor das questões? ");
        vq=sc.nextFloat();
//laço:
        while (i<5){//o que vai ser necessário repetir
            System.out.print("Nome? ");
            nome=sc.next();
            System.out.print("quantidade de questões acertadas? ");
            qqa=sc.nextFloat();
                nota=vq*qqa;
                notas_Somadadas+=nota;
            System.out.println("----(candidato "+(i+1)+") "+nome+" |NOTA:"+nota);

                if(nota>maior_nota){//verificar quem tirou e qual foi a maior nota
                    maior_nota=nota;
                    nomeMaiorNota = nome;
                }
            i++;
        }

//exibido ao final do programa
        media=notas_Somadadas/5;
        System.out.println("MÉDIA:"+media);   
        System.out.println("MAIOR NOTA:"+maior_nota+", DO CANDIDATO "+nomeMaiorNota); 
        sc.close();
    }
}
/*a verificação(if) de quem tirou e qual foi a maior nota deve ser feita dentro
do laço, para que seja possivel salvar a maior nota atual e copara-la com a anterior.*/