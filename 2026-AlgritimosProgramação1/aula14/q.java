public class q {
    public static void main(String[] args) {
        
        // O loop começa em 20, vai até 2, e diminui de 2 em 2 (i -= 2)
        for (int i = 20; i >= 2; i -= 2) {
            
            // Math.pow(2, i) calcula 2 elevado a 'i'
            long resultado = (long) Math.pow(2, i);
            
            System.out.println("2^" + i + " = " + resultado);
        }
    }
}
