package ExerciciosPOO;

import java.util.Scanner;

public class Ex37 {
	public static void main(String[] args) {
		
//		37. Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. Entre as tabuadas,
//		solicitar que o usuário pressione uma tecla.

		Scanner entrada = new Scanner(System.in);
		
		int num =20, t;
		String tecla;
		
		for (int i =0;i<=10;i++) {
			t = num*i;
			System.out.printf(" \n%d x %d = %d",num,i,t);
			
			}
		System.out.println("\nPressione uma tecla para continuar\n ");
		tecla =entrada.next();
			
		for (int i =11;i<=20;i++) {
			t = num*i;
			System.out.printf(" \n%d x %d = %d",num,i,t);
			
			}
				
		
		
		entrada.close();
	}

}
