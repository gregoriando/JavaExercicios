package ExerciciosPOO;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
//		36. Entrar via teclado com um valor (X) qualquer. Travar a digitação, no sentido de aceitar
//		somente valores positivos. Solicitar o intervalo que o programa que deverá calcular a
//		tabuada do valor digitado, sendo que o segundo valor (B), deverá ser maior que o primeiro
//		(A), caso contrário, digitar novamente somente o segundo. Após a validação dos dados,
//		exibir a tabuada do valor digitado, no intervalo decrescente, ou seja, a tabuada de X no
//		intervalo de B para A.
		
		Scanner entrada = new Scanner(System.in);
		int num2,t,num;
		
		System.out.println("Digite um valor:");
		num = entrada.nextInt();
		System.out.println("Digite um valor:");
		num2 = entrada.nextInt();
		
		while(num<0) {
		System.out.println("Digite um valor:");
		num = entrada.nextInt();
		System.out.println("Digite um valor:");
		num2 = entrada.nextInt();
		}
		while(num2<num) {
			System.out.println("Digite o segundo numero novamente: ");
			num2 = entrada.nextInt();
		}
		for(;num<num2;num2--) {
			t = num*num2;
			System.out.printf("\n %d x %d = %d", num, num2 , t);
		}
		
	 entrada.close();
	}

}
