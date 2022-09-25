package ExerciciosPOO;

import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		
//		49. Crie um programa que solicite que o usuário entre com dois números (inicial e final). Ao
//		final o programa deverá apresentar o valor total da soma de todos os números do intervalo
//		digitado pelo usuário

		
		int num=0,num2,total=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro: ");
		num = entrada.nextInt();
		System.out.println("Entre com outro numero inteiro: ");
		num2 = entrada.nextInt();
		
		for(;num<=num2;num2--) {
			total += num2;
			
		}
		System.out.println(total);
		entrada.close();
	}

}
