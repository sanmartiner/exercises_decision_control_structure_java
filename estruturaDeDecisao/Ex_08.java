package estruturaDeDecisao;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pre�o produto1: ");
		double p1 = scan.nextDouble();
		
		System.out.println("Pre�o produto1: ");
		double p2 = scan.nextDouble();
		
		System.out.println("Pre�o produto1: ");
		double p3 = scan.nextDouble();
		
		if(p1 < p2 && p1 < p3) {
			System.out.println(p1+" � o produto mais barato.");
		} else if(p2 < p1 && p2 < p3) {
			System.out.println(p2+" � o produto mais barato.");
		}else if(p3 < p1 && p3 < p2) {
			System.out.println(p3+" � o produto mais barato.");
		}
	}

}
