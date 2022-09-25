package ExerciciosPOO;

import java.util.Scanner;

public class Ex27 {
	public static void main(String[] args) {
		
//		27. Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja
//		ímpar, imprimir o resultado desta operação.

		int num, resto;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero ");
		num = entrada.nextInt();
		resto = num % 2;
		if(resto == 0) {
			System.out.println("o numero é par "+(num+5));
		}else {
			System.out.println("o numero é impar "+(num+8));
		}
		entrada.close();
	}

}
