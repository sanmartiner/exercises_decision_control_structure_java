package estruturaDeDecisao;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Entrada valor //
		
		System.out.println("Entre com um valor: ");
		double num = scan.nextDouble();
		
		if(num >= 0) {
			System.out.println("O valor é positivo.");
		} else {
			System.out.println("O valor é negativo");
		}
	}

}
