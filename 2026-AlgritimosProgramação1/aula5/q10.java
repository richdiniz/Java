public class q10 {
    /*Atualmente, ano de 2020, o Museu A tem 1000 obras em sua coleção e o
Museu B tem 500 obras. Todo ano o Museu A consegue adquirir 100 obras e
o museu B consegue adquirir 130 obras. Calcule e informe em que ano o
museu B terá mais obras que o museu A.*/
    public static void main(String[] args) {
        int ano = 2020;

        int museuA = 1000;
        int museuB = 500;

        while (museuB <= museuA) {
            museuA += 100;
            museuB += 130;
            ano++;
        }

        System.out.println("O Museu B terá mais obras que o Museu A no ano de: " + ano);
        System.out.println("Museu A terá: " + museuA + " obras");
        System.out.println("Museu B terá: " + museuB + " obras");
    }
}
