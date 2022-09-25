package ExerciciosPOO;

import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		
//		48. Crie um programa em que o usuário entre com um número inteiro qualquer, e o
//		programa imprima os 20 números subsequentes ao que foi digitado pelo usuário
		
		int num=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro: ");
		num = entrada.nextInt();
		
		for(int i=0 ;i<=20;i++) {
			System.out.println((num+i));
		}
		
		entrada.close();
	}

}
