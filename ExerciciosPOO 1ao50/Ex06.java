package ExerciciosPOO;

import java.util.Scanner;
//6. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$)
public class Ex06 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double  cotDolar, dolar, real;
		System.out.println("Digite a cotação do dolar hoje: \n");
		cotDolar = entrada.nextDouble();
		System.out.println("Digite o valor em dolar para ser convertido: \n");
		dolar = entrada.nextDouble();
		
		real= dolar*cotDolar;
		
		System.out.println("O valor em real é: R$ \n"+real);
		
		entrada.close();
	}

}
