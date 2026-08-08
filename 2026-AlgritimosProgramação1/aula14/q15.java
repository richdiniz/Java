/*public class q15 {
    public static void main(String[] args) {

        double n1=2, n2=1, sa=0, sb=0, s=0;
        for (int i = 0; i <10; i++) {
            sa=n1/n2;
            sb=(n1+2)/(n2+1);
            s+=sb-sa;
        }
        System.out.print("S: "+s);
    }
}
*/
public class q15 {
    public static void main(String[] args) {
        double s = 0;

        // O 'i' vai representar o denominador (de 1 até 10)
        for (int i = 1; i <= 10; i++) {
            double numerador = i * 2; // O de cima é sempre o dobro do de baixo
            double denominador = i;

            // Se o de baixo for ÍMPAR (1, 3, 5...), a gente SOMA
            if (i % 2 != 0) {
                s += (numerador / denominador);
                System.out.println("+"+numerador+"/"+denominador);
            } 
            // Se o de baixo for PAR (2, 4, 6...), a gente SUBTRAI
            else {
                s -= (numerador / denominador);
                System.out.println("-"+numerador+"/"+denominador);
            }
        }

        System.out.println("S: " + s); // Vai printar 0.0 perfeitamente!
    }
}