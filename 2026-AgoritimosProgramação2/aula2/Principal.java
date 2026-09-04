package aula2;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
	//Criação dos Objetos alocacao no array:
		Carro  c1= new Carro();
		Carro  c2= new Carro();
		Carro  c3= new Carro();
		Carro  c4= new Carro();
		Carro[] carros= {c1, c2, c3, c4};
		Moto m1= new Moto();
		Moto m2= new Moto();
		Moto m3= new Moto();
		Moto m4= new Moto();
		Moto[] motos= {m1, m2, m3, m4};
		
//cadastro_Dos_Carros:
		for(int i=0; i<carros.length; i++){
			System.out.println(i+1+")Digite Nome/marca/modelo: ");
			carros[i].marca=sc.nextLine();
			System.out.println("Digite a velocidade:");
			carros[i].velocidade=sc.nextDouble();
			System.out.println("Digite o peso:");
			carros[i].peso=sc.nextDouble();
			System.out.println("Digite a cilindrada:");
			carros[i].cilindrada=sc.nextDouble();
			sc.nextLine();
		}
		double maiorVelocidade=0;
		String maiorVnome="";
		//corrida:
			for(int i=0; i<carros.length; i++){
				for(int seg=1; seg<=20; seg++){
					if(seg==6|| seg==11|| seg==15){
						carros[i].frear();
					}else{
						carros[i].acelerar();
					}
					
					if(carros[i].velocidade>maiorVelocidade){
						maiorVelocidade=carros[i].velocidade;
						maiorVnome=carros[i].marca;
					}
				}
			}
			//Resultado:
			System.out.println("QUEM GANHOU A CORRIDFA DE CARROS FOI O "+maiorVnome+", COM "+maiorVelocidade+"Km/H");
			
			
			System.out.println("###CORRIDA DAS MOTOS###");
//cadastro_Das_Motos:
		for(int i=0; i<motos.length; i++){
			System.out.println(i+1+")Digite Nome/marca/modelo:");
			motos[i].marca=sc.nextLine();
			System.out.println("Digite a velocidade:");
			motos[i].velocidade=sc.nextDouble();
			System.out.println("Digite o peso:");
			motos[i].peso=sc.nextDouble();
			System.out.println("Digite a cilindrada:");
			motos[i].cilindrada=sc.nextDouble();
			System.out.println();
		}
		maiorVelocidade=0;
		maiorVnome="";
		//corrida:
			for(int i=0; i<motos.length; i++){
				for(int seg=1; seg<=20; seg++){
					if(seg==6|| seg==11|| seg==15){
						motos[i].frear();
					}else{
						motos[i].acelerar();
					}
					
					if(motos[i].velocidade>maiorVelocidade){
						maiorVelocidade=motos[i].velocidade;
						maiorVnome=motos[i].marca;
					}
				}
			}
			//Resultado:
			System.out.print("QUEM GANHOU A CORRIDFA DE CARROS FOI O "+maiorVnome+", COM "+maiorVelocidade+"Km/H");

		
		sc.close();
	}
}
