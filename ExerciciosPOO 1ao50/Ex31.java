package ExerciciosPOO;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
//		31. Criar uma rotina de entrada que aceite somente um valor positivo.

		Scanner entrada = new Scanner(System.in);
		
		int a ;
		
			System.out.println(" Digite um numero positivo\n");
			a = entrada.nextInt();
		while(a<0) {
			System.out.println(" Digite um numero positivo");
			a = entrada.nextInt();
			
			entrada.close();
		}

	}

}
