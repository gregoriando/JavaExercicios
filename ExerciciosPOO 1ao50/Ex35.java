package ExerciciosPOO;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
	
//		35. Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar
//		somente valores positivos. Após a digitação, exibir a tabuada do valor solicitado, no
//		intervalo de um a dez
		
		Scanner entrada = new Scanner(System.in);
		int i,t,num;
		System.out.println("Digite um valor");
		num = entrada.nextInt();
		
		while(num<0) {
			System.out.println("Digite um valor");
		num = entrada.nextInt();
		}
		for(i=1;i<=10;i++) {
			t = num*i;
			System.out.printf("\n %d x %d = %d", num, i , t);
		}
		entrada.close();
	}

}

