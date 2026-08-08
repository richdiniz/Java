public class q22 {
    public static void main(String[] args) {
    long somafat=0;
        for (int i = 2; i <=10; i++){
            System.out.print(i+")");
            int n=i; int fat=1;
            for (int ii = 1; ii<=n; ii++) {
                    fat*=ii;
                    somafat+=fat;
                }
            System.out.println("fatorial de "+n+"! = "+fat);
        }
    System.out.println("o resultado é S = "+somafat);
    }
}
