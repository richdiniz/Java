import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][]folha= new int[30][2];
        //c0 da matriz qt de motos pequenas(100)
        //c1 da matriz qt de motos grandes(250)
        String[]vetclasse= new String[30];//armazena A ou B
        //indice do vetor = linha da matriz = código do vendedor

        //entrada de dados:
            //classe do vendedor
        for (int i = 0; i <30; i++) {
            System.out.print(i+")digite A ou B:");
            vetclasse[i]=sc.next();
        }
            //qt vendida
        for (int i = 0; i <30; i++) {
            for (int j = 0; j <2; j++) {
                System.out.print(i+")digite:");
                folha[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        sc.close();
        
        //impressão da matriz:
        for (int i = 0; i <30; i++) {
            for (int j = 0; j<2; j++) {
                System.out.print("|"+folha[i][j]);
            }
            System.out.println();
        }
        //cálculo:
        int salario=0;
        for (int i = 0; i <30; i++) {
            for (int j = 0; j <2; j++) {
                if (vetclasse[i].equals("A")) {
                    salario=780+((folha[i][0]*100)+(folha[i][1]*250));
                }else{
                    salario=1000+((folha[i][0]*100)+(folha[i][1]*250));
                }
            }
            //salario=
            System.out.println(i+" recebe "+salario+" de salario.");
        }

    }
}