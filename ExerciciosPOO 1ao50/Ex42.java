package ExerciciosPOO;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		
//		42. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será
//		digitado, deverá ser positivo, mas menor que cinqüenta. Caso o valor não satisfaça a
//		restrição, enviar mensagem de erro e solicitar o valor novamente.

		
		int vezes, num=1, den=2;
				
				Scanner entrada = new Scanner(System.in);
				
				
				System.out.println("Entre com o valor menor que 50 positivo, para exibir a soma da sequencia: ");
					vezes= entrada.nextInt();
				
				while(vezes > 50 || vezes < 0) {
					System.out.println("ERRO! Digite um numero menor que 50 e positivo");
					vezes = entrada.nextInt();
				}
				
				for(int i=0;i<vezes;i++) {
					
					num++;
					den++;
					
					System.out.printf("%d / %d  ,  ", num, den);
					
			entrada.close();	
				

	}

}
}

