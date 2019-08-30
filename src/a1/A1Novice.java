package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Your code follows here.
		int totalCustomers = scan.nextInt();
		for (int i = 0; i < totalCustomers; i++) {
			Double grandTotal = 0.0;

			String nextLine = scan.next(); //1
			char fr = nextLine.charAt(0);
			String nextName = scan.next();//2
			String ol = scan.next();//3
			int groceries = Integer.parseInt(ol);
			for (int j = 0; j < groceries; j++) {
				String a = scan.next();//4
				String b = scan.next();//5
				String c = scan.next();//6
				Double first = Double.parseDouble(a);
				Double second = Double.parseDouble(c);
				Double totals = first * second;
				 grandTotal += totals;
			}
			String finalTotal = String.format("%.2f", grandTotal);
			System.out.println(fr + ". " + nextName+":" + " " + finalTotal + " ");
		}
	}
}
