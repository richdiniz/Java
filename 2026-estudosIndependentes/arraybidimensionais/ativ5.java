public class ativ5 {
    public static void main(String[] args){
//CRIANDO MATRIZ 1:
        int [][] matriz1={{1,10,11},{2,20,22}};
        System.out.println("-------------matriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j]+"\t");
            }
            System.out.println();
        }
//CRIANDO MATRIZ 2: *OBS: ESSA É VAZIA!*
        int [][]matriz2=new int[3][2];
        System.out.println("--------------Matriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j]+"\t");
            }
            System.out.println();
        }

//TROCANDO VALORES VAZIOS PELOS DA MATRIZ1(JÁ PREENCHIDOS)
        System.out.println("SUBSTITUIÇÃO:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                //System.out.print(matriz1[j][i]+"\t");
                matriz2[i][j]=matriz1[j][i];
                System.out.print(matriz2[i][j]+"\t");
            }
            System.out.println();
        }
        //matriz2[i][j]=matriz1[j][i];
    }
}
