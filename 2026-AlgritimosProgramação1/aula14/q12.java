public class q12 {
    public static void main(String[] args) {
        int num=5, fat=0;
        for (int i = 0; i <6; i++) {
            fat+=num*(num-1);
        }
        System.out.println("fatoril de 5="+fat);
    }
}