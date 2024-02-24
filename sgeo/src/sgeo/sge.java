package sgeo;

import java.util.Scanner;

public class sge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sicaklik Derecesini Giriniz: ");
		int sicaklik = scanner.nextInt();
		
		if (sicaklik < 5) {
			System.out.print("Kayak");			
		} else if (sicaklik >= 5 && sicaklik < 15) {
			System.out.print("Tiyatro");
		} else if (sicaklik >= 15 && sicaklik < 25) {
			System.out.print("Mangal");
		} else if (sicaklik >= 25) {
			System.out.print("Yuzme");
		}
		
	}

}
