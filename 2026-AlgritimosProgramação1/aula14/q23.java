public class q23 {
    public static void main(String[] args) {
        for (int i = 0; i <19; i++) {
            long y=2, valor=0, x=2;

            for(int j = 0; j <=i; j++){
                valor=x*y;
                y=valor;
            }
            if((i+2)%2==0){
                System.out.println("2^"+(i+2)+" = "+valor);
            }
            y+=2;
        }
    }
}