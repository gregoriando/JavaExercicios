package ExerciciosPOO;

import java.util.Scanner;

public class Ex50 {

	public static void main(String[] args) {
		
//		50. Elabore um programa que apresente os números pares maiores que 10 no intervalo
//		fechado [A, B]. Sendo que A e B serão números inteiros escolhidos pelo usuário. Um
//		número é par quando este satisfaz a seguinte condição: (NÚMERO mod 2 = 0)
		
		int num=0,num2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro: ");
		num = entrada.nextInt();
		System.out.println("Entre com outro numero inteiro: ");
		num2 = entrada.nextInt();
		
		for(;num<=num2;num2--) {
			if(num2>10 && num2%2==0) {
				System.out.println("numeros pares maiores que dez "+num2);
			}
			
		}
		
		entrada.close();

	}

}
