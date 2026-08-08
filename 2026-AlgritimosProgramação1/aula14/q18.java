import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=0;
       
        System.out.print("digite: ");
        n=s.nextLong();
        
        if (n<=0) {
            System.out.println("Digite um número maior que 0.");
        }else if (n==1) {
            System.out.println("1");
        }else{
            long antigo=1;
            long atual=1;
            System.out.print(antigo+", "+atual);

            for (int i = 0; i <=n; i++) {
                long proximo=antigo+atual;
                System.out.print(", "+proximo);
                antigo=atual;
                atual=proximo;
            }
            System.out.println("...");
        }

        s.close();
    }
}