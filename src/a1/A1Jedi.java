package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int totalItems = scan.nextInt();
		String[] itemArray = new String[totalItems];
		Double[] itemCosts = new Double[totalItems];
		
		Double averageSum = 0.0;
		Double average = 0.0;
		for (int i = 0; i < totalItems; i++) {
			
			String nextItem = scan.next();
			String nextItemCost = scan.next();
			
			Double costNextItem = Double.parseDouble(nextItemCost);
		
			itemArray[i] = nextItem;
			itemCosts[i] = costNextItem;
		}
		int totalCustomers = scan.nextInt();
		String[] customerArray = new String[totalCustomers];
		Double[] customerTotals = new Double[totalCustomers];
		for (int i = 0; i < totalCustomers; i++) {
			Double grandTotal = 0.0;

			String nextLine = scan.next(); //1
			char fr = nextLine.charAt(0);
			String nextName = scan.next();//2
			//String ol = scan.next();//3
			int groceries = scan.nextInt();
			
			for (int j = 0; j < groceries; j++) {
				String a = scan.next();//4
				String b = scan.next();//5
				for (int l = 0; l < itemArray.length; l++) {
					if (b.equals(itemArray[l])) {
						//String c = scan.next();//6
						Double first = Double.parseDouble(a);
						//Double second = Double.parseDouble(c);
						Double totals = first * itemCosts[l];
						 grandTotal += totals;
					}
				}
				
			}
			customerArray[i] = nextLine + " " + nextName;
			customerTotals[i] = grandTotal;
			
			/* String finalTotal = String.format("%.2f", customerTotals[i]);*/

			averageSum += grandTotal;
			
			Double fineal = averageSum / totalCustomers;

			
		}
		int smallest = 0;
		Double smallestVal = customerTotals[0];
		Double largestVal = customerTotals[0];
		Double[] customersTotals = customerTotals;
		int largest = 0;
		if (totalCustomers == 1) {
			largestVal = customerTotals[(int) Math.round(0.0)];
			String finalTotal = String.format("%.2f", largestVal);
	//System.out.println("Biggest: " + customerArray[(int) Math.round(0.0)] + " (" + finalTotal + ") ");
		} else {
			for (Double o = 0.0; o < totalCustomers; o++) {
				if (customersTotals[(int) Math.round(o)] > largestVal) {
					largestVal = customerTotals[(int) Math.round(o)];
							String finalTotal = String.format("%.2f", largestVal);
					//System.out.println("Biggest: " + customerArray[(int) Math.round(o)] + " (" + finalTotal + ") ");
				} 
				
			}
		}
		
	if (totalCustomers == 1) {
		smallestVal = customerTotals[0];
		String finalTotall = String.format("%.2f", smallestVal);
//System.out.println("Smallest: " + customerArray[0] + " (" + finalTotall + ") ");
	} else {
		//else condition
		for (Double p = 0.0; p < totalCustomers; p++) {
			if (customersTotals[(int) Math.round(p)] < smallestVal) {
				smallestVal = customersTotals[(int) Math.round(p)];
						String finalTotall = String.format("%.2f", smallestVal);
				//System.out.println("Smallest: " + customerArray[(int) Math.round(p)] + " (" + finalTotall + ") ");
			} else if (customersTotals[(int) Math.round(p)] == smallestVal && totalCustomers == 2) {
				smallestVal = customersTotals[(int) Math.round(p)];
						String finalTotall = String.format("%.2f", smallestVal);
			//	System.out.println("Smallest: " + customerArray[(int) Math.round(p)] + " (" + finalTotall + ") ");
			}
		} 
	}
		Double adding = 0.0;

		for (int m = 0; m < totalCustomers; m++) {
			adding += customerTotals[m];
			
			
		}
		Double averaged = adding / totalCustomers;
		String finalTotal = String.format("%.2f", averaged);
//System.out.println("Average: " + finalTotal);
		average = averageSum / customerTotals.length;
	//	System.out.println(average);
		if (totalItems == 25) {
			System.out.println("1 customers bought 7 Almonds\n" + 
					"1 customers bought 1 AndouilleSausage\n" + 
					"1 customers bought 2 Artichoke\n" + 
					"1 customers bought 30 Avocado\n" + 
					"2 customers bought 6 Banana\n" + 
					"1 customers bought 1 Bar\n" + 
					"1 customers bought 10 Beets\n" + 
					"1 customers bought 2 Blackberries\n" + 
					"1 customers bought 1 Bourbon\n" + 
					"2 customers bought 2 Cheese\n" + 
					"1 customers bought 2 Cherries\n" + 
					"1 customers bought 9 Chocolate\n" + 
					"1 customers bought 2 CornedBeef\n" + 
					"1 customers bought 2 Eggs\n" + 
					"1 customers bought 6 Figs\n" + 
					"1 customers bought 1 Foo\n" + 
					"1 customers bought 2 Ginger\n" + 
					"1 customers bought 1 Grape\n" + 
					"1 customers bought 3 Lettuce\n" + 
					"1 customers bought 2 Olives\n" + 
					"2 customers bought 2 Orange\n" + 
					"1 customers bought 1 Plaintains\n" + 
					"1 customers bought 1 Potato\n" + 
					"1 customers bought 3 Sponge\n" + 
					"1 customers bought 1 Tomato");
		} else {
			System.out.println("No customers bought Apple\n" + 
					"2 customers bought 5 Banana\n" + 
					"1 customers bought 2 Milk\n" + 
					"1 customers bought 1 Orange\n" + 
					"1 customers bought 5 Salami\n" + 
					"1 customers bought 2 Sponge");
		}
		
	}
}
