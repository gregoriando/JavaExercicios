package ex53;

import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		
//		53. Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que utilize
//		essa classe para cadastrar 5 alunos em uma lista de alunos. Durante o cadastro do aluno,
//		solicitar para o aluno cadastrar a sigla/iniciais das 6 matérias que ela está cursando no
//		momento. Ao final exibir apenas os alunos do período “noite”
		
		Aluno[] aluno = new Aluno[5];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<2;i++) {
			
			Aluno  a = new Aluno(); 
			System.out.println("aluno "+(i+1));
			
			System.out.println("Digite o Ra do aluno: ");
			a.ra= entrada.next();
			
			System.out.println("Digite o nome do aluno: ");
			a.nome= entrada.next();
			
			System.out.println("Digite o periodo do aluno: ");
			a.periodo= entrada.next();
			
			for(int j = 0; j<2; j++) {
				System.out.println("inicial da matéria: "+(j+1));
				a.materia[j] = entrada.next();
			}	
				aluno[i] = a;
			
		}
		for(int i=0 ; i<2;i++) {
		if(aluno[i].periodo.equals("noite")) {
			System.out.println("Alunos da turma da noite");
			System.out.println(aluno[i].nome);
			for(int j= 0;j<2;j++) {
				System.out.println(aluno[i].materia[j]);
			}
			
			}
		}
		entrada.close();
}
}


