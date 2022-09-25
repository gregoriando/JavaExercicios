package ExerciciosPOO;

import java.util.Scanner;
//16. Verificar se três valores quaisquer (A, B, C) que serão digitados formam ou não um triângulo retângulo. Lembre-se que o quadrado da hipotenusa é igual a soma dos quadrados dos catetos.
public class Ex16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a,b,c, cateto, hipotenusa;
		
		System.out.println("Digite os três valores");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		
		hipotenusa = a*a;
		cateto = (b*b) + (c*c);
		System.out.println(cateto);
		if (cateto == hipotenusa) {
			System.out.println("Esse é um Triângulo Retângulo");
		}else
			System.out.println("Esse não é um Triângulo Retângulo");
		
		entrada.close();
		
	}

}
