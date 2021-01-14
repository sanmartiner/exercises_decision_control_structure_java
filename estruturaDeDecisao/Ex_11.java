package estruturaDeDecisao;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor do salário: ");
		double valorSalario = scan.nextDouble();
		
		double percentualReajusteSalario = 0;
		
		if(valorSalario <= 280) {
			percentualReajusteSalario = 20;
		} else if(valorSalario > 280 && valorSalario <= 700) {
			percentualReajusteSalario = 15;
		} else if(valorSalario > 700 && valorSalario < 1500) {
			percentualReajusteSalario = 10;
		} else if(valorSalario > 1500) {
			percentualReajusteSalario = 5;
		}
		
		double salarioAtualizado = ((valorSalario/100)*percentualReajusteSalario)+valorSalario;
		
		System.out.println("Valor do salário: "+valorSalario);
		System.out.println("Percentual de reajuste: "+percentualReajusteSalario);
		System.out.println("Valor do reajuste: "+(valorSalario/100)*percentualReajusteSalario);
		System.out.println("Salário atualizado: "+salarioAtualizado);
	}

}
