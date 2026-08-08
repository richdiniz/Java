import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        double peso=0; String codigo=""; double qt_DF=0; double qt_AbM=0; double qt_AcM=0;
        double p_excedente=0; double taxa=0; double vt_taxa=0;
        double maior_p=-1; String m_p_c="";

        System.out.println("peso min:");
        double p_min=sc.nextDouble();
        System.out.println("peso max:");
        double p_max=sc.nextDouble();

        while (i<6) {
            System.out.print("peso da encomeda: ");
            peso=sc.nextDouble();
            System.out.print("códigop da encomenda: ");
            codigo=sc.next();
            if (peso>=p_min && peso<=p_max) {
                System.out.println("encomenda ["+codigo+"] aceita.");
                qt_DF++;
            }else if(peso<p_min){
                System.out.println("encomenda ["+codigo+"] abaixo do peso mínimo.");
                qt_AbM++;
            }else if (peso>p_max) {
                System.out.println("encomenda ["+codigo+"] acima do peso máximo");
                qt_AcM++;
               p_excedente= peso-p_max;
               taxa=p_excedente*5;
                vt_taxa+=taxa;
                if (peso>maior_p) {
                    maior_p=peso;
                    m_p_c=codigo;
                }
            }
            i++;
        }
        System.out.println("quantidade de encomendas dentro da faixa: "+qt_DF);
        System.out.println("quantidade de encomendas abaixo do peso: "+qt_AbM);
        System.out.println("quantidade de encomendas acima do peso: "+qt_AcM);
        System.out.println("valor total das taxas extras: "+vt_taxa);
        System.out.println("codigo da encomenda com maior peso:"+m_p_c+"/["+maior_p+"]");
        sc.close();
    }
}