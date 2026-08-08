public class q10 {
    public static void main(String[] args) {
        int num=0, soma=0;
        int vet[]= new int[20];
        for(int i = 0; i <20; i++){
                if(i%2==0){
                    vet[i]=(num+=5);
                    System.out.println(""+vet[i]);
                }
                else{
                     vet[i]=(num+=5);
                     vet[i]=-vet[i];
                     System.out.println(""+vet[i]);
                }
            soma+=vet[i];
        }
        System.out.println("soma= "+soma);
        
    }
}
