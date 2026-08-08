import java.util.Scanner;
/*Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa.
Para isto, mandou digitar uma linha para cada mercadoria com nome, preço de compra e preço
de venda das mesmas. Fazer um programa que leia os dados e apresente, para cada mercadoria
se proporciona:
● lucro menor que 10%
● lucro entre 10% e 20%, inclusive os dois
● lucro maior que 20% 
Ao final, determine e apresente o valor total de compra e de venda de todas as mercadorias,
assim como o lucro total.
Observação: ao final da digitação e apresentação dos dados de cada mercadoria deve-se
perguntar ao usuário se ele deseja continuar, encerrando a leitura quando ele responder “não”
para a pergunta.
*/
public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nome_produto=""; double p_compra, p_venda, lucro; 
        String resposta;

            do{
            System.out.print("nome da mercadoria: ");
            nome_produto=sc.next();
            System.out.print("preço de compra: ");
            p_compra=sc.nextDouble();
            System.out.print("preço de venda: ");
            p_venda=sc.nextDouble();

            lucro = p_venda - p_compra;
            double p10=(p_compra*10)/100;
            double p20=(p_compra*20)/100;


            if (lucro<p10){
                System.out.println("("+nome_produto+","+lucro+")--lucro menor que 10%.");
            }else if(lucro>=p10 && lucro<=p20){
                System.out.println("("+nome_produto+","+lucro+")--lucro entre 10% e 20%.");
            }else{
                System.out.println("("+nome_produto+","+lucro+")--lucro maior que 20%.");
            }

            System.out.print("continuar?");
            resposta=sc.next();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
            
        }while (!resposta.equalsIgnoreCase("n")) ;

        sc.close();
    }
}
//ler pra entender...