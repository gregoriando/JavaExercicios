package ExerciciosPOO;

import java.util.Scanner;

public class Ex45 {

	public static void main(String[] args) {
		
//		45. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade
//				de números) será digitado, deverá ser positivo, mas menor que vinte. Caso a quantidade
//				não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
//				digitação dos “N” valores, exibir:
//				a) O maior valor;
//				b) O menor valor;
//				c) A soma dos valores;
//				d) A média aritmética dos valores;
//				e) A porcentagem de valores que são positivos;
//				f) A porcentagem de valores negativos;
		
		Scanner entrada = new Scanner(System.in);
		
		int maior=0,soma =0, media=0,menor=0,i=0;
		double h=0,j=0;
		
		System.out.println("Digite uma quantidade de entradas que deseja cadastrar(menor que vinte):");
		 i = entrada.nextInt();
		
			while(i >20 || i <0) {
			
			System.out.println("Digite até vinte entradas ");
			i= entrada.nextInt();
			}
			
			int[] vetor = new int[i];
			
			for( i =0; i<vetor.length; i++) {
				
				System.out.printf("Digite os numeros:[%d] ",i+1);
				vetor[i] = entrada.nextInt();
			
				soma+= vetor[i];
				media = soma/vetor.length;
				
				if(i==0) {
					maior = vetor[i];
				}
				if(vetor[i]>maior) {
					maior = vetor[i];
				}
				if(i== 0) {
					menor = maior;
				}
				if(vetor[i]<menor) {
					menor = vetor[i];
				}
				if(vetor[i]<0) {
					j++;
					
				}
				if(vetor[i]>0) {
					h++;
					
				}
			
				
			}
			j= (i-j*100)/i-1;
			h= (i-h*100)/i-1;
			
			System.out.println("O maior número digitado é: \n"+maior);
			System.out.println("A soma dos números digitados é: \n"+soma);
			System.out.println("A média dos números digitados é: \n"+media);
			System.out.println("O menor número dos números digitados é: \n"+menor);
			System.out.printf("Porcentagem de numeros negativos: %.2f \n",j);
			System.out.printf("A porcentagem de numeros positivos é: %.2f \n",h);
		
			
		entrada.close();

}
}
