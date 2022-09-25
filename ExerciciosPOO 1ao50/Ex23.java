package ExerciciosPOO;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
//		23. Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é
//		menor que C.

		int a , b ,c;
		Scanner entrada = new Scanner(System.in);
		System.out.println("entre com tres valores");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		
		if(a+b < c) {
			System.out.println("A soma de A + B é menor que C");
		}else
			System.out.println("A soma de A + B é maior que C");
		
		entrada.close();

	}

}
