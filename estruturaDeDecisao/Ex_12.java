package estruturaDeDecisao;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Horas trabalhadas");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		
		double impostoSindical = 3/100;
		
	}

}
