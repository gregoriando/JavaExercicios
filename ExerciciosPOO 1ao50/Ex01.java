package ExerciciosPOO;

import java.util.Scanner;
 //1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.

public class Ex01 {
	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
		 
		int base, altura;
		
		System.out.println("Digite a altura e a base para calcular a área do retângulo: ");
			base = ler.nextInt();
			altura = ler.nextInt();
		System.out.println("O tamanho da area do retângulo é: "+base*altura);
		
		ler.close();
		
	}

}
