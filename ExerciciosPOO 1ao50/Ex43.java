package ExerciciosPOO;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		
//		43. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será
//		digitado, deverá ser positivo, mas menor que cinqüenta. Caso o valor não satisfaça a
//		restrição, enviar mensagem de erro e solicitar o valor novamente

		int N, soma=0, i=0,x=0, cont=0, NumAnt=2, NumSeq=1;
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("Entre com o valor menor que 50 positivo, para exibir a soma da sequencia: ");
		N = entrada.nextInt();
		
		while(N > 50 || N < 0) {
			System.out.println("ERRO! Digite um numero menor que 50 e positivo");
			N = entrada.nextInt();
		}
		
		int vetN[] = new int[N];
		
		while(x < N){
		
			System.out.printf(" %d ", NumAnt);
	
			vetN[x]=NumAnt;
			
			soma += NumAnt;
			NumSeq +=2;
			NumAnt += NumSeq;
			
			x++;
		
		}
		
		System.out.printf(" \n ");
		
		
		System.out.printf(" \n ");
	
		x=0;
		i=1;
		soma =0;
		
		while(x < N){
			
			if(x > 0) {
				
				cont=x;
				
				while(cont > -1) {
					
					soma+=vetN[cont];
					
					cont--;	
				}
				
				System.out.printf(" %d ", soma+=i);
				
				i++;
				
			}else {
				
				System.out.printf("  ");
			}
			
				
			x++;
		}
		
		entrada.close();
	}

}
