package ExerciciosPOO;

import java.util.Scanner;
//5. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double celsius, fahrenheit;
		System.out.println("Digite a temperatura em celsius: \n");
		celsius = entrada.nextDouble();
		
		fahrenheit = (celsius *9/5) + 32;
		
		System.out.println("O grau em fahrenheit é: "+fahrenheit);
		entrada.close();
		
	}

}
