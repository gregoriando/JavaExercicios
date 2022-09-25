package ExerciciosPOO;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
//		33. Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como
//		respostas válidas
		
		Scanner entrada = new Scanner(System.in);
		char sexo;
		
		System.out.println("Digite F para mulher e M para homem:");
		sexo = entrada.nextLine().charAt(0);
		
		while(sexo != 'F' && sexo != 'M') {
			System.out.println("Digite F para mulher e M para homem ");
			sexo = entrada.nextLine().charAt(0);
			
		}
		entrada.close();
	}

}
