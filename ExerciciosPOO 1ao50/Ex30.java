package ExerciciosPOO;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
//		30. Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o
//		preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da
//		tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo
//		adequado e exibir o valor a ser pago no final.
//		Código Condição de pagamento
//		1 À vista em dinheiro ou cheque, recebe 10% de desconto
//		2 À vista no cartão de crédito, recebe 15% de desconto
//		3 Em duas vezes, preço normal de etiqueta sem juros
//		4 Em quatro vezes, preço normal de etiqueta mais juros de 10%
		
		
		Scanner entrada = new Scanner(System.in);
		double preco,desconto;
		int num;
		
		System.out.println("Digite o preço do produto");
		preco = entrada.nextDouble();
		
		System.out.println("Selecione a forma de pagamento"
				+ "\n1 - Á vista em dinheiro ou cheque"
				+ "\n2 - Á vista no cartão de credito"
				+ "\n3 - Em duas vezes"
				+ "\n4 - Em quatro vezes"
				+ "\n5 - Fim Do Programa!!!");
		num = entrada.nextInt();
		switch(num){
		case 1:
			desconto = preco-(preco*0.1);
			System.out.println("O preço a vista  é "+desconto);
			break;
		case 2:
			desconto = preco-(preco*0.15);
			System.out.println("O preço a vista no cartão é "+desconto);
			break;
		case 3:
			System.out.println("O preço em duas vezes é  "+preco);
			break;
		case 4:
			desconto = preco+(preco*0.1);
			System.out.println("O preço em quatro vezes é "+desconto);
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
