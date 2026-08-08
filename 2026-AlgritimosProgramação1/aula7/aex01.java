import java.util.Scanner;

public class aex01 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int idade, qtPessoas = 0, somaIdades = 0;
int menorIdade = 150;
String sexoNova = "";
System.out.print("Digite a idade: ");
idade = sc.nextInt();
while (idade > 0) {
System.out.print("Sexo: ");
String sexo = sc.next();
somaIdades = somaIdades + idade;
qtPessoas = qtPessoas + 1;

if (idade < menorIdade) {
menorIdade = idade;
sexoNova = sexo;
}
System.out.print("Digite a idade: ");
idade = sc.nextInt();
}
if (qtPessoas > 0) {
System.out.println("Média: " + (somaIdades / qtPessoas));
System.out.println("Sexo da pessoa mais nova: " + sexoNova);
}
sc.close();
    /*
    Scanner entrada= new Scanner(System.in);
    int idade;
    int soma=0;
    int cont=0;
    String sexo;

  System.out.print("digite a idade ou 0 para encerrar");
    idade=entrada.nextInt();

    int maior=0;
    int menor=9999;
    while(idade>0){
        System.out.print("Digite o sexo m/f:");
        sexo=entrada.next();
        soma=soma+idade;
        cont=cont+1;

        if(idade>maior){
            maior=idade;
        }
        if(idade<menor){
            menor=idade;
        }
        System.out.print("digite a idade ou 0 para encerrar");
        idade=entrada.nextInt();
    }
    System.out.println("laço encerrado");
    if(cont>0){

    }
    if (sexo
}*/
}
}