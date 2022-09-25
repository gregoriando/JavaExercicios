package ExerciciosPOO;

import java.util.Scanner;

public class Ex19 {
//Uma escola com cursos em regime semestral, realiza duas avaliações durante o semestre e calcula a média do aluno, da seguinte maneira:

//MEDIA = (P1 + 2.P2) / 3
//
//Fazer um programa para entrar via teclado com os valores das notas (P1 e P2) e calcular a média. Exibir a situação final do aluno (“Aprovado ou Reprovado”), sabendo que a média de aprovação é igual a cinco.

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		double p1, p2, media;
		System.out.println("Digite a nota da P1 e P2");
		p1 = entrada.nextDouble();
		p2 = entrada.nextDouble();
		
		media = (p1+ 2*p2) /3;
		
		if (media >= 5) {
			System.out.printf("Aprovado, sua nota é: %.2f",media);
		}else
			System.out.printf("reprovado, sua nota é: %.2f",media);
		
		entrada.close();

	}

}
