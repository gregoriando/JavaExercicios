package ExerciciosPOO;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
//		26. Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo,
//		imprimindo o resultado.

		int num;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero ");
		num = entrada.nextInt();
		
		if(num >=  0) {
			System.out.println("o dobro do numero positivo é: "+num*2);
		}else {
			System.out.println("o triplo do numero negativo é: "+num*3);
		}
		entrada.close();

	}

}
