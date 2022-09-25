package ExerciciosPOO;

import java.util.Scanner;
//12. Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”, caso contrário, exibir a mensagem “Terreno pequeno”.

public class Ex12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.println("Digite a altura e a base para calcular a área do retângulo: ");
			base = entrada.nextInt();
			altura = entrada.nextInt();
			area= base*altura;
		System.out.println("O tamanho da area do retângulo é: "+area);
			if(area>=100) 
				System.out.println("Terreno grande");
			else
				System.out.println("Terreno pequeno");
			entrada.close();
	}

}
