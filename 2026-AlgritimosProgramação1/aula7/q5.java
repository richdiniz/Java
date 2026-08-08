public class q5 {
    public static void main(String[] args) {
        
        double preco;
        int quantidade = 120;
        double despesas = 2000;

        System.out.println("Preco\tQuantidade\tLucro");

        for (preco = 50; preco >= 30; preco -= 5) {

            double receita = preco * quantidade;
            double lucro = receita - despesas;

            System.out.println(
                preco + "\t" + quantidade + "\t\t" + lucro
            );

            // Aumenta 30 ingressos para o próximo preço
            quantidade += 30;
        }
    }
}
//ler pra entender... e pesquisar sobre o FOR!