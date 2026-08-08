import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int i=0;
         String nome="";
         int qt_madeira_colet=0;
         int tt_Bcoletor=0;
         int tt_Mestre=0;
         while (i<10) {
            System.out.println("nome do jogador: ");
            nome=sc.next();
            System.out.print("Quantidade de madeira coletada: ");
            qt_madeira_colet=sc.nextInt();
            if (qt_madeira_colet<0) {
                System.out.print("Valor invalido!");
            }else{
                if (qt_madeira_colet<50) {
                    System.out.println("pouco recurso!");
                }else if (qt_madeira_colet<150) {
                    System.out.println("Bom coletor!");
                    tt_Bcoletor++;
                }else{
                     System.out.println("mestre da coleta!");
                     tt_Mestre++;
                }
            }
            i++;
         }
         System.out.println("Classificados: " + (tt_Mestre+tt_Bcoletor));
         System.out.println("mestres da coletaes :"+tt_Mestre);
         System.out.println("Bons coletores :"+tt_Bcoletor);
         System.out.println("nome"+ nome);
         sc.close();
    }
}
