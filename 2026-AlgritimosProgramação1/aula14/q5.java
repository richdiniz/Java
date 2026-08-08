public class q5 {
    public static void main(String[] args) {
       int soma=0, cont=1;
        for (int i = 10; i <1001; i+=5) {
            System.out.println(cont+")"+i);
            soma+=i;
            cont++;
        }
        System.out.println();
        //System.out.println("Soma: "+soma);
        //System.out.println("qt termos "+(cont-1));
        int media= soma/(cont-1);
        System.out.println("média dos termos é "+soma+"/"+(cont-1)+"="+media);
    }
}
