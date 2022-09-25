package ExerciciosPOO;

import java.util.Scanner;
//15. A partir de três valores que serão digitados, verificar se formam ou não um triângulo. Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou eqüilátero”. Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e o eqüilátero, todos os lados iguais. Para existir triângulo é necessário que a soma de dois lados quaisquer seja maior que o outro, isto, para os três lados.

public class Ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int l1, l2,l3;
		System.out.println("Digite os três lados");
		l1 = entrada.nextInt();
		l2 = entrada.nextInt();
		l3 = entrada.nextInt();
		
		if(l2+l3>l1 && l1+l3>l2 && l1+l2>l3) {
			
				if(l1!=l2 && l2!=l3 && l3!=l1) {
					System.out.println("É um triângulo Escaleno");
				}
				else if (l1==l2 && l2==l3 && l3==l1) {
					System.out.println("É um triângulo Equilátero");
						
					}
				else {
					System.out.println(" É um triângulo Isósceles");
				}
			
		}else {
			System.out.println("Não é um triângulo!");
		}
		entrada.close();
		
	}

}
