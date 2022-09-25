package ExerciciosPOO;

import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {
		
		
//		46. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade
//				de números) será digitado, deverá ser positivo, mas menor que vinte. Caso a quantidade
//				não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
//				digitação dos “N” valores, exibir:
//				a) O maior valor;
//				b) O menor valor;
//				c) A soma dos valores;
//				d) A média aritmética dos valores;
//				e) A porcentagem de valores que são positivos;
//				f) A porcentagem de valores negativos;
//				Após exibir os dados, perguntar ao usuário se deseja ou não uma nova execução do
//				programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
//				programa em função dessa resposta.
		
	Scanner entrada = new Scanner(System.in);
		
		int maior=0,soma =0, media=0,menor=0,i=0,h=0,j=0;
		
		char encerrar='0';
		
		while(encerrar != 'y') {
		
		System.out.println("Digite uma quantidade de entradas que deseja cadastrar(menor que vinte):");
		 i = entrada.nextInt();
		
			while(i >20 || i <0) {
			
			System.out.println("Digite até vinte entradas ");
			i= entrada.nextInt();
			}
			
			int[] vetor = new int[i];
			
			for( i =0; i<vetor.length; i++) {
				
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
			System.out.printf("Porcentagem de numeros negativos: %d \n",j);
			System.out.printf("A porcentagem de numeros positivos é: %d \n",h);
			
			System.out.println("Aperte y para encerrar");
			encerrar = entrada.next().charAt(0);
			
	}

		
		
		entrada.close();


	}

}
