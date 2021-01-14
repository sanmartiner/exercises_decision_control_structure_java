package estruturaDeDecisao;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int n1 = scan.nextInt();
		
		System.out.println("Entre com o primeiro numero: ");
		int n2 = scan.nextInt();
		
		System.out.println("Entre com o primeiro numero: ");
		int n3 = scan.nextInt();
		
		if(n1 < n2 && n1 < n3 && n2 < n3) {
			System.out.println("Sequencia decrescente é: "+n3+" - "+n2+" - "+n1);
		} else if(n2 < n1 && n2 < n3 && n1 < n3) {
			System.out.println(p2+" é o produto mais barato.");
		}else if(p3 < p1 && p3 < p2) {
			System.out.println(p3+" é o produto mais barato.");
		}
	}

}
