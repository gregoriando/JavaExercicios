package ExerciciosPOO;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
//		24. Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo
//		seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).

		String nome;
		String sexo;
		String estadoCivil;
		int anos;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome ");
		nome = entrada.next();
		System.out.println("Digite seu sexo m para mulher e h para homem ");
		sexo = entrada.next();
		System.out.println("Digite seu estado civil ");
		estadoCivil = entrada.next();
		if(estadoCivil.equals("casada") && sexo.equals("m")) {
			System.out.println("Informe quando tempo de casada você tem");
			anos = entrada.nextInt();
			System.out.println("Obrigado ^^");
		}else {
			System.out.println("Obrigado pelas informações");
		}
		entrada.close();

	}

}
