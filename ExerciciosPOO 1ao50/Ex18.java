package ExerciciosPOO;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
//		18. Criar um programa para analisar a velocidade de um automóvel. Solicitar via teclado os
//		valores da aceleração (a em m/s2), velocidade inicial (v0 em m/s) e o tempo de percurso (t
//		em s). Calcular e exibir a velocidade final do automóvel em km/h
		
		Scanner entrada = new Scanner(System.in);
		double aceleracao, velocidadeInicial, tempo,velocidade;
		
		System.out.println("Entre com a velocidade inicial em m/s");
		velocidadeInicial = entrada.nextDouble();
		System.out.println("Entre com a Aceleração em m/s²");
		aceleracao = entrada.nextDouble();
		System.out.println("Entre com o tempo de percurso em Segundos");
		tempo = entrada.nextDouble();
		
		velocidade = velocidadeInicial + aceleracao * tempo;
		
		if(velocidade <=40) {
			System.out.println("Veículo muito lento");
		}else if(40 < velocidade && velocidade <=60 ) {
			System.out.println("Velocidade Permitida");
		}else if(60 < velocidade && velocidade <= 80) {
			System.out.println("Velocidade de cruzeiro");
		}else if(80 < velocidade && velocidade <= 120) {
			System.out.println("Veiculo rápido");
		}else if(velocidade >120) {
			System.out.println("Veiculo muito rápido");
		}
		
		entrada.close();

	}

}
