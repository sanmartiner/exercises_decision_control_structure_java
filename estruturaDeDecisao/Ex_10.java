package estruturaDeDecisao;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual periodo você estuda: ");
		System.out.println("Digite M - Matutino");
		System.out.println("Digite V - Vespertino");
		System.out.println("Digite N - Noturno");
		
		String periodo = scan.next();
		
		if(periodo.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		} else if(periodo.equalsIgnoreCase("V")){
			System.out.println("Boa tarde!");
		} else if(periodo.equalsIgnoreCase("N")){
			System.out.println("Boa noite!");
		}
	}

}
