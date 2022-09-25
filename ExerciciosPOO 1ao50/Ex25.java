package ExerciciosPOO;

import java.util.Scanner;

public class Ex25 {
	public static void main(String[] args) {
		
//		25. Faça um algoritmo para receber um número qualquer e informar na tela se é par ou
//		ímpar. Utilize o operador %

		int num, resto;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero ");
		num = entrada.nextInt();
		resto = num % 2;
		if(resto == 0) {
			System.out.println("o numero é par ");
		}else {
			System.out.println("o numero é impar");
		}
		entrada.close();
	}

}
