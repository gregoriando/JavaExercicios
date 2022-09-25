package ExerciciosPOO;

import java.util.Scanner;

public class Ex41 {
public static void main(String[] args) {
	
//	41. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será
//	digitado, deverá ser positivo, mas menor que cem. Caso o valor não satisfaça a restrição,
//	enviar mensagem de erro e solicitar o valor novamente.
//	A seqüência: 2, 5, 10, 17, 26, ....
//	
	int vezes, soma=0, i=0,x=0, NumAnt=2, NumSeq=1;
	
	Scanner entrada = new Scanner(System.in);
	
	
	System.out.println("Entre com o valor menor que 100 para exibir a soma da sequencia: ");
	vezes = entrada.nextInt();
	
	while(vezes<0 ||vezes > 100) {
		System.out.println("ERRO! Digite um numero menor que 100");
		vezes = entrada.nextInt();
	}
	
	
	while(x < vezes){
		

		System.out.printf("%d ,", NumAnt);
		soma += NumAnt;
		NumSeq +=2;
		NumAnt += NumSeq;
		
		
		x++;
		
	}
	
	System.out.println("\n\nVALOR TOTAL DA SOMA: ");
	System.out.printf("Total = %d", soma);
	
	
	
	
	

	entrada.close();
}
}
