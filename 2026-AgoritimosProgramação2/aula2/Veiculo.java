package aula2;

public class Veiculo {
	String marca;
	double velocidade;
	double peso;
	double cilindrada;
	
	public void acelerar(){
		velocidade=velocidade+5;
		velocidade+=velocidade*((15/100)*cilindrada);
		velocidade-=peso/300;
	}
	
	public void frear(){
		velocidade-=velocidade*0.25;
	}
}
