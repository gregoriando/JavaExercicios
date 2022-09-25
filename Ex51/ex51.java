package Ex51;

import java.util.Scanner;

public class ex51 {
	public static void main(String[] args) {
		
//		51. Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que utilize
//		essa classe para cadastrar 5 clientes em uma lista de clientes (array). Ao final exibir apenas
//		os clientes que têm idade superior a 18 anos.
		
		Scanner entrada = new Scanner(System.in);
		
		Cliente[] cadastro = new Cliente[5];
		
		for(int i=0; i<5;i++) {
			
			Cliente p = new Cliente();
			System.out.println("Digite o id da pessoa");
			p.id = entrada.nextInt();
			
			System.out.println("Digite o nome da pessoa");
			p.nome = entrada.next();
			
			System.out.println("Digite o idade da pessoa");
			p.idade = entrada.nextInt();
			
			System.out.println("Digite o email da pessoa");
			p.email = entrada.next();
			
			cadastro[i]= p;
			
		}
		for(int i=0; i<5;i++) {
			
			if(cadastro[i].idade >= 18) {
				System.out.printf("Esses usuários tem 18 ou mais:\n %d\n %s\n %d\n %s\n",cadastro[i].id,cadastro[i].nome,cadastro[i].idade,cadastro[i].email);
			}
		}
		
		
		
		entrada.close();
	}

}
