package ExerciciosPOO;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
//		22. Exibir o seguinte seletor de opções e em função de uma escolha, solicitar os dados
//		necessários para o cálculo da respectiva área. Enviar mensagem de erro se o usuário
//		escolher uma opção inexistente.
//		Encerrar o programa somente quando selecionada a opção de finalização. (Fazer esse
//		exercício utilizando If..Else e/ou Case)
//		1 – Triângulo
//		2 – Quadrado
//		3 – Retângulo
//		4 – Círculo
//		5 – Fim de processo
//		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("Selecione uma das seguintes opções"
				+ "\n1 - Triângulo"
				+ "\n2 - Quadrado"
				+ "\n3 - Retângulo"
				+ "\n4 - Círculo"
				+ "\n5 - Fim Do Programa!!!");
		num = entrada.nextInt();
		switch(num){
		case 1:
			double a, base,altura;
			System.out.println("Digite base a altura: ");
			base = entrada.nextDouble();
			altura = entrada.nextDouble();
			 
			a = (base*altura)/2;
			System.out.println("Area de um triangulo é "+a);
			break;
		case 2:
			double aresta;
			System.out.println("Digite da aresta para calcular a área do quadrado:\n ");
			aresta= entrada.nextDouble();
			System.out.println("O tamanho da área do quadrado é: "+aresta*aresta);
			
			break;
		case 3:
			System.out.println("Digite a altura e a base para calcular a área do retângulo: ");
				base = entrada.nextInt();
				altura = entrada.nextInt();
			System.out.println("O tamanho da area do retângulo é: "+base*altura);
			
			break;
		case 4:
			double raio;
			System.out.println("Digite o raio de um circulo");
			raio = entrada.nextDouble();
			a = 3.14*(raio*raio);
			System.out.println("A área de um circulo é "+a);
			
			break;
		case 5:
			System.out.println("Fim!!!");
			break;
		default:
			System.out.println("Número inválido");
		}
		entrada.close();
	}

}
