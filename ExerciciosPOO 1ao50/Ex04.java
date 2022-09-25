package ExerciciosPOO;

import java.util.Scanner;
//4. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
public class Ex04 {
	public static void main(String[] args) {
		
		double total=0 , media=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas:\n");
		int qtdNotas = entrada.nextInt();
		double[] notas = new double[qtdNotas];
		
		for(int i=0 ;i<notas.length; i++) {
			System.out.println("Informa a nota: "+(i+1));
			notas[i]= entrada.nextDouble();
			
		}
		for(int i=0 ;i<notas.length; i++) {
			total+=notas[i];
		}
		
//		for (double nota: notas) {
//			total+=nota;
//		}
		 media= total/notas.length;
		 System.out.println("A média é: "+media);
		
		entrada.close();
		
	}

}
