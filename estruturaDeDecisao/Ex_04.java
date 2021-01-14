package estruturaDeDecisao;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira uma letra: ");
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("a")) {
			System.out.println("A letra é uma vogal.");
		} else if(letra.equalsIgnoreCase("e")) {
			System.out.println("A letra é uma vogal.");
		} else if(letra.equalsIgnoreCase("i")) {
			System.out.println("A letra é uma vogal.");
		} else if(letra.equalsIgnoreCase("o")) {
			System.out.println("A letra é uma vogal.");
		} else if(letra.equalsIgnoreCase("u")) {
			System.out.println("A letra é uma vogal.");
		} else {
			System.out.println("A letra é uma consoante");
		}
	}

}
