package ExerciciosPOO;

import java.util.Scanner;

public class Ex47 {

	
	public static void main(String[] args) {
		
//		47. Calcular o fatorial de um valor que será digitado. Este valor não poderá ser negativo.
//		Enviar mensagem de erro e solicitar o valor novamente, se necessário. Perguntar se o
//		usuário deseja ou não fazer um novo cálculo, consistir a resposta em “S” ou “N”.
//		N! = N x N-1 x N-2 x N-3 x ....... x (N - (N-1))
//		Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120

		char encerrar= '0';
		int n=0,i=1;
		Scanner entrada = new Scanner(System.in);
		
		while(encerrar != 'y') {
			
			System.out.println("Digite o numero a ser fatoriado");
			n = entrada.nextInt();
			
			while(n<0) {
				System.out.println("Digite novamente o numero a ser fatoriado");
				n = entrada.nextInt();
			}
			
			for(; n>=1 ;--n) {
				i*=n;
			}
			System.out.println("O fatorial é: "+i);		
			
			System.out.println("Aperte Y para encerrar");
			encerrar = entrada.next().charAt(0);
		}
		
		
		
		entrada.close();

	}

}
