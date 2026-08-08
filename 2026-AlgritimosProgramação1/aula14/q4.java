public class q4 {
    public static void main(String[] args) {
        int numero=50, soma=0;
        for (int i = 0; i <10; i++) {
            System.out.println(i+1+"° termo: "+numero);
            numero+=50;
            soma+=numero;
        }
        System.out.println("Soma dos termos:"+(soma-numero+50));
    }
}
