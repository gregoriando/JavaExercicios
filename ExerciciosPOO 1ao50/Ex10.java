package ExerciciosPOO;

import java.util.Scanner;
//10. Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário, enviar mensagem avisando que os números são idênticos
public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b,maior;
		System.out.println("Digite o primeiro valor ");
		a = entrada.nextInt();
		System.out.println("Digite o segundo valor ");
		b = entrada.nextInt();
		
		if(a>b) {
			maior = a;
			System.out.println("O valor do maior é "+maior);
		}
		else if (b>a) {
			maior = b;
			System.out.println("O valor de maior é "+maior);
		}
		else {
			System.out.println("Os valores são iguais");
		}
		entrada.close();
	}

}
