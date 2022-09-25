package Ex52;

import java.util.Scanner;

public class ex52 {
	public static void main(String[] args) {
		
//		52. Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que utilize
//		essa classe para cadastrar 10 produtos em uma lista de produtos. Ao final exibir apenas os
//		produtos cujo valor é menor do que 100 reais.

		
		Scanner entrada = new Scanner(System.in);
		
		Produto[] c = new Produto[10];
		
		for(int i=0;i<10;i++) {
			
			Produto p = new Produto();
			
			System.out.println("Digite o id: ");
			p.id = entrada.nextInt();
			System.out.println("Digite a descrição: ");
			p.descricao = entrada.next();
			System.out.println("Digite o valor: ");
			p.valor = entrada.nextDouble();
			System.out.println("Digite o Quantidade: ");
			p.quantidade = entrada.nextDouble();
			
			c[i]=p;
		}
		for(int i=0;i<2;i++) {
			if(c[i].valor < 100.00) {
				System.out.println("Produtos com o preço menor que 100,00 reais\n"+c[i].descricao+"\n"+c[i].valor);
			}
		}
		entrada.close();
	}

}
