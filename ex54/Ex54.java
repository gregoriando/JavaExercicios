package ex54;

import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {
		
		
//		54. Crie as classes conforme o Diagrama de Classe (UML) abaixo. Crie um programa que
//		utilize essas classes para cadastrar 5 clientes em uma lista de clientes e pergunte para
//		cada cliente se ele tem ou não conta bancária. Caso o cliente tenha, permita ele cadastrar
//		os dados da conta bancária. Ao final exibir todos os clientes e suas respectivas contas
//		bancárias, se houver
		
		Scanner entrada= new Scanner(System.in);
		
		Cliente[] c = new Cliente[10];
	
		int id;
		String nome;
		char possuiConta;
		int idade;
		String email;
		double saldo;
		String agencia;
		String numero;
		
		for(int i =0; i<2;i++) {
			
			Cliente p;
			
			System.out.println("Digite o id do cliente:");
			id = entrada.nextInt();
			System.out.println("Digite o nome do cliente:");
			nome = entrada.next();
			System.out.println("Digite o idade do cliente:");
			idade = entrada.nextInt();
			System.out.println("Digite o email do cliente:");
			email = entrada.next();
			
			System.out.println("Você possui conta bancaria? (S/N)");
			possuiConta = entrada.next().charAt(0);
			
			if(possuiConta == 'S') {
				System.out.println("Digite o numero da sua agência:");
				agencia = entrada.next();
				System.out.println("Digite o numero da sua conta:");
				numero = entrada.next();
				System.out.println("Digite o seu saldo:");
				saldo = entrada.nextDouble();
				
				ContaBancaria acount = new ContaBancaria(agencia,numero,saldo);
				
				p = new Cliente(id,nome,idade,email,acount);
				
			}else {
				p = new Cliente(id,nome,idade,email,null);
			}
			c[i]=p; // Cliente c = p para vetor;
		}
		for(int i =0; i<2;i++) {
			System.out.println(" "+c[i].exibirNomeIdade());
			
			if(c[i].conta != null) {
				System.out.println("Dados da conta "+c[i].DadosConta());
			}
		}
		entrada.close();
	}

}
