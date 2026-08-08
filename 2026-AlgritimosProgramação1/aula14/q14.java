import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int i=0, num=0, maior=-1; long mFat=1;
        while(i<10){
            System.out.print("Digite um número: ");
            num=s.nextInt();
            if (maior<num) {
                maior=num;
            }
            i++;
        }
        System.out.println("---o maior é: "+maior);
        
        for (int j=1; j<=maior; j++) {
            mFat=mFat*j;
        }
        System.out.println("---o fatorial de "+maior+" é "+mFat+"!");
        s.close();
    }
}
