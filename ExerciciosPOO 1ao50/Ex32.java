package ExerciciosPOO;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
//		32. Entrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro.
//		Caso contrário solicitar novamente apenas o segundo valor
		
		Scanner entrada = new Scanner(System.in);
		
		int num1 , num2;
		System.out.println("Digite o primeiro numero");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo numero");
		num2 = entrada.nextInt();
		
		while(num2<num1) {
			System.out.println("Digite novamente o segundo valor");
			num2 = entrada.nextInt();
		}
		entrada.close();
		
	}

}
