package estruturaDeDecisao;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o sexo: ");
		String sexo = scan.next();
		
		if(sexo.equalsIgnoreCase("m")) {
			System.out.println("Sexo é Masculino");
		} else { if(sexo.equalsIgnoreCase("f")) {
			System.out.println("Sexo é Feminino");
		} else {
			System.out.println("Sexo inválido");
		}
			
		}
	}

}
