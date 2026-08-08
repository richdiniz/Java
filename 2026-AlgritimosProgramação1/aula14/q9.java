public class q9 {
    public static void main(String[] args) {
        double n1=5, n2=3;
        double s=0;
        for (int i = 0; i <15; i++) {
            //n2+=2;
            s+= n1/n2;
            n1=n1+5;
            n2=n2+5;
        }
        System.out.println("S="+s);
    }
}
