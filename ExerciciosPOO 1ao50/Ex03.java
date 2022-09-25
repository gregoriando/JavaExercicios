package ExerciciosPOO;

import java.util.Scanner;
//3. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double altura, base;
		System.out.println("Digite a altura e a base para calcular a área: \n");
		altura = ler.nextDouble();
		base = ler.nextDouble();
		
		System.out.println("Area do triângulo: "+base*altura/2);
		ler.close();

	}

}
