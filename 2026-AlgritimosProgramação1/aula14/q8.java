public class q8 {
    public static void main(String[] args) {
        double n1=20, n2=0;
        double s=0;
        for (int i = 0; i <15; i++) {
            n2+=2;
            s+= n1/n2;
        }
        System.out.println("S="+s);
    }
}
