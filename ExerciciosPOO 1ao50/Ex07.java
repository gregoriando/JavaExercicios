package ExerciciosPOO;

import java.util.Scanner;
//7. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] produtos = new double [5];
		double soma=0, pagamento;
		
		for(int i =0; i<5 ; i++) {
			System.out.println("Digite o valor do produto "+(i+1));
			produtos[i] = entrada.nextDouble();	
			soma+=produtos[i];
			
		}
		System.out.println("A soma dos produtos é: \n"+soma);
		System.out.println("Digite o valor do pagamento\n");
		pagamento = entrada.nextDouble();
		
		System.out.printf("O valor do troca é: %f",pagamento-soma);
		
		entrada.close();

	}

}
