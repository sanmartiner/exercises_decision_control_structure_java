package estruturaDeDecisao;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Entrada primeiro numero //
		System.out.println("Entre com um numero: ");
		int num1 = scan.nextInt();
		
		// Entrada segundo numero //
		System.out.println("Entre com um numero: ");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior valor inserido é: "+num1);
		} else {System.out.println("O maior valor inserido é: "+num2);}

	}

}
