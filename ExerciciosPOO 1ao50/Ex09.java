package ExerciciosPOO;

import java.util.Scanner;
//9. Entrar via teclado, com dois valores distintos. Exibir o menor deles.

public class Ex09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b,menor;
		System.out.println("Digite o primeiro valor ");
		a = entrada.nextInt();
		System.out.println("Digite o segundo valor ");
		b = entrada.nextInt();
		
		if(a<b) {
			menor = a;
			System.out.println("O valor do menor é "+menor);
		}
		else if (b<a) {
			menor = b;
			System.out.println("O valor de menor é "+menor);
		}
		else {
			System.out.println("Os valores são iguais");
		}
		
		entrada.close();
	}
}