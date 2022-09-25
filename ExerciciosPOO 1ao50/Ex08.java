package ExerciciosPOO;

import java.util.Scanner;
//8. Entrar via teclado, com dois valores distintos. Exibir o maior deles.
public class Ex08 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a, b,maior;
		System.out.println("Digite o primeiro valor ");
		a = entrada.nextInt();
		System.out.println("Digite o segundo valor ");
		b = entrada.nextInt();
		
		if(a>b) {
			maior = a;
			System.out.println("O valor do maior é "+maior);
		}
		else if (b>a) {
			maior = b;
			System.out.println("O valor de maior é "+maior);
		}
		else {
			System.out.println("Os valores são iguais");
		}
		entrada.close();
	}

}
