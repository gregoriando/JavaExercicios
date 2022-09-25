package ExerciciosPOO;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
//		21. Entrar via teclado com dois valores quaisquer. Após a digitação, exibir um seletor de
//		opções (“menu”) com as seguintes opções: (Fazer esse exercício utilizando If..Else e/ou
//		Case)
//		1 – Multiplicação
//		2 – Adição
//		3 – Divisão
//		4 – Subtração
//		5 – Fim de processo (sair do programa)
//		Solicitar uma opção por parte do usuário, verificar se é ou não uma opção válida (letras ou
//		números) e processar a respectiva operação. Enviar mensagem de erro se a opção
//		escolhida não existir no seletor.
//		Encerrar o programa somente quando o usuário escolher a opção de finalização. Repare
//		que a opção de número três é de divisão e o programa deverá enviar mensagem de erro,
//		(somente nesta opção) se o denominador for zero.

		Scanner entrada = new Scanner(System.in);
		double a,b;
		int num;
		
		System.out.println("Digite dois números");
		a = entrada.nextDouble();
		b =  entrada.nextDouble();
		
		System.out.println("Selecione uma das seguintes opções"
				+ "\n1 - Multiplicação"
				+ "\n2 - Adição"
				+ "\n3 - Subtração"
				+ "\n4 - Divisão"
				+ "\n5 - Fim Do Programa!!!");
		num = entrada.nextInt();
		switch(num){
		case 1:
			System.out.println("O resultado da sua multiplicação é "+(a*b));
			break;
		case 2:
			System.out.println("O resultado da sua adição é "+(a+b));
			break;
		case 3:
			System.out.println("O resultado da sua subtração é "+(a-b));
			break;
		case 4:
			if(a==0) {
				System.out.println("Não pode dividir por zero");
			}else {
				System.out.println("O resultado da sua divisão é "+(a/b));
			}
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

