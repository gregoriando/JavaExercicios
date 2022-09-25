package ExerciciosPOO;

import java.util.Scanner;
//17. Entrar com o peso, o sexo e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².
public class Ex17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double  altura, peso, total;
		String sexo = "";
		System.out.println("Digite sua altura e seu peso\n");
		
		altura = entrada.nextDouble();
		peso = entrada.nextDouble();
		 
		total = peso/(altura*altura);
		
		System.out.println("Digite h para homem e m para mulher");
		sexo = entrada.next();
		
		if(sexo.equals("m")) {
			if(total<19) {
				System.out.println("Abaixo do peso");
			}else if (total > 19 && total <24) {
				System.out.println("peso ideal");
			}else {
				System.out.println("Acima do peso");
			}
			
		}
		if(sexo.equals("h")) {
			if(total<20) {
				System.out.println("Abaixo do peso");
			}else if (total > 20 && total <25) {
				System.out.println("peso ideal");
			}else {
				System.out.println("Acima do peso");
			}
		}
		System.out.printf("Seu imc é: %.2f ",total);
		
		entrada.close();
	}

}
