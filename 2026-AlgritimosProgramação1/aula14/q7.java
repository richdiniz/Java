public class q7 {
    public static void main(String[] args) {
        int n=10;
        double s=0;
        int[]vet=new int[5000]; 
        for (int i = 0; i <500; i++) {
            vet[i]=n;
            n+=10;
            System.out.print(+vet[i]+"  ");
        }
        System.out.println();
        
        for (int i = 1; i <500; i++) {
            //s=(vet[i-1])-(vet[i])+(vet[i++]);
            s=-10*250;
        }
        System.out.println("valor de S: "+(s/100));
    }
}
