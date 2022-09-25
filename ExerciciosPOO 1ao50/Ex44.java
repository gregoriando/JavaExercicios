package ExerciciosPOO;

import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		
//		44. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem
//		de erro, se necessário. Após a digitação, exibir:
//		a) O maior valor;
//		b) A soma dos valores;
//		c) A média aritmética dos valores;
		
		Scanner entrada = new Scanner(System.in);
		
		int maior=0,soma =0, media=0;
		
		int[] vetor = new int[10];
		
			for(int i =0; i<vetor.length; i++) {
				System.out.printf("Digite dez numeros:[%d] ",i+1);
				vetor[i] = entrada.nextInt();
				
				soma+= vetor[i];
				media = soma/vetor.length;
				
				if(i==0) {
					maior = vetor[i];
				}
				if(vetor[i]>maior) {
					maior = vetor[i];
				}
				
			}
			System.out.println("O maior número digitado é: \n"+maior);
			System.out.println("A soma dos números digitados é: \n"+soma);
			System.out.println("A média dos números digitados é: \n"+media);
			entrada.close();
 }
}
			
			
		
		