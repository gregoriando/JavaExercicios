package ExerciciosPOO;

import java.util.Scanner;
//2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.

public class Ex02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double aresta;
		System.out.println("Digite da aresta para calcular a área do quadrado:\n ");
		aresta= ler.nextDouble();
		System.out.println("O tamanho da área do quadrado é: "+aresta*aresta);
		ler.close();
	}

}
