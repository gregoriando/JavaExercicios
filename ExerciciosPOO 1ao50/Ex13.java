package ExerciciosPOO;

import java.util.Scanner;
//13. Entrar via teclado com três valores distintos. Exibir o maior deles.
public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b, c, maior;
		
		System.out.println("Digite o primeiro numero ");
		a = entrada.nextInt();
		System.out.println("Digite o segundo numero ");
		b = entrada.nextInt();
		System.out.println("Digite o terceiro numero ");
		c = entrada.nextInt();
		
		if(a>b && a>c) {
			maior = a;
			System.out.println("O maior valor é "+maior);
		}
		else if (b>a && b>c) {
			maior = b;
			System.out.println("o maior valor é "+maior);
		}
		else if (c>a && c>b) {
			maior = c;
			System.out.println("o maior valor é: "+maior);
		}
		else
		{
			System.out.println("Os números são iguais");
		}
		entrada.close();
	}

}
