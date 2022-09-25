package ExerciciosPOO;

import java.util.Scanner;
//14. Entrar com o peso e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double  altura, peso, total;
		System.out.println("Digite sua altura e seu peso\n");
		
		altura = entrada.nextDouble();
		peso = entrada.nextDouble();
		 
		total = peso/(altura*altura);
		
		if(total>25) {
			System.out.println("Você está acima do peso, seu imc é "+total);
		}else {
			System.out.println("seu imc é: "+total);
		}
		
		System.out.println();
		
		entrada.close();

	}

}
