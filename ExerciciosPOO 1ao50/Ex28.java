package ExerciciosPOO;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
//		28. Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem
//		crescente.

		int num1, num2, num3;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe tres numero ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		num3 = entrada.nextInt();
		
		if(num1 >= num2 && num1 >= num3 && num2>=num3) {
			System.out.println("ordem crescente1 "+num3+" "+num2+" "+num1);
		}else if (num2>=num1 && num2>= num3 && num1>=num3) {
			System.out.println("ordem crescente2 "+num3+" "+num1+" "+num2);
		}else if (num3>=num1 && num3>= num2 && num2>=num1) {
			System.out.println("ordem crescente3 "+num1+" "+num2+" "+num3);
		}else if (num3>= num1 && num3>= num2 && num1>num2) {
			System.out.println("ordem crescente4 "+num3+" "+num2+" "+num1);
		}else {
			System.out.println("ordem crescente5 "+num1+""+num2+""+num3);
		}
	
		entrada.close();

	}

}
