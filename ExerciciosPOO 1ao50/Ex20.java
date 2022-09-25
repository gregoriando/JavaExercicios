package ExerciciosPOO;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
//		. Uma escola com cursos em regime semestral realiza duas avaliações durante o
//		semestre e calcula a média do aluno, da seguinte maneira:
//		MEDIA = (P1 + 2.P2) / 3
//		Fazer um programa para entrar via teclado com o valor da primeira nota (P1) e o programa
//		deverá calcular e exibir quanto o aluno precisa tirar na segunda nota minimamente (P2)
//		para ser aprovado, sabendo que a média de aprovação é igual a cinco.

		Scanner entrada = new Scanner(System.in);
			double p1=0,p2=0;
		System.out.println("Entre com a nota da P1");
			p1 = entrada.nextDouble();
		
			p2 = (5.0*3.0 - p1)/2;
		
		
				System.out.printf("Você precisa tirar: %.2f na P2 para passar.",p2);
		
		
		entrada.close();

}
}