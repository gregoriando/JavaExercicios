package ExerciciosPOO;

public class Ex39 {

	public static void main(String[] args) {
		
		//39. Exibir os trinta primeiros valores da série de Fibonacci. A série: 1, 1, 2, 3, 5, 8, ...

		int num1= 1, num2=0;
		 System.out.println(num2);
		 System.out.println(num1);
		 
		 for(int i = 0; i<=28;i++) {
			 num1 = num1 + num2;
			 num2 = num1 - num2;
			 System.out.println(num1);
		 }
	}

}
