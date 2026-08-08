package q4;
import java.util.Scanner;
public class cadprodutoo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        produt[] lista=new produt[3];

        double valorTotalEstoque=0;
        //Leitura dos dados
        for(int i = 0; i < lista.length; i++) {
           System.out.println("==Produto("+(i+1)+")==");
           lista[i]=new produt();

           System.out.print("Código: ");
           lista[i].codigo=s.nextInt();
           s.nextLine();// 🔄 AJUSTADO: Limpa o buffer do teclado após o nextInt

           System.out.print("Nome: ");
           lista[i].nome=s.nextLine();

           System.out.print("Quantidade: ");
           lista[i].quantidade=s.nextInt();

           System.out.print("Preço: ");
           lista[i].preco=s.nextDouble();
           s.nextLine();// limpa para o próximo loop

           valorTotalEstoque+=lista[i].quantidade*lista[i].preco;
        }

        //Encontrando o produto mais caro:
        produt maisCaro=lista[0];
        for ( int i = 1; i < lista.length; i++) {
            if (lista[i].preco>maisCaro.preco){
                maisCaro=lista[i];
            }
        }

        //Exibição dos resultados
        System.out.println("==Resultados==");
        System.out.println("Valor total do Estoque: R$ "+valorTotalEstoque);
        System.out.println("Produto mais caro: "+maisCaro.nome+"(R$"+maisCaro.preco+")");
        s.close();
    }
}