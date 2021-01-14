package estruturaDeDecisao;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Entre com o segundo numero: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Entre como terceiro numero: ");
		double num3 = scan.nextDouble();
				
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1+" é o maior numero.");
		} else if(num2 > num1 && num2 > num3) {
			System.out.println(num2+" é o maior numero");
		}else if(num3 > num1 && num3 > num2) {
			System.out.println(num3+" é o maior numero");
		}

	}

}
