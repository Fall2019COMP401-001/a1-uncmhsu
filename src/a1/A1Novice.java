package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int totalCustomers = scan.nextInt();
		//System.out.println(totalCustomers);
		String nextLine = scan.next(); //1
		char fr = nextLine.charAt(0);
		String nextName = scan.next();//2
		String ol = scan.next();//3
		String a = scan.next();//4
		String b = scan.next();//5
		String c = scan.next();//6
		String d = scan.next();//7
		String e = scan.next();//8
		String f = scan.next();//9
		String g = scan.next();//10
		String h = scan.next();//11
		String i = scan.next();//12
		String j = scan.next();//13
		char frT = j.charAt(0);
		String k = scan.next();//14
		String l = scan.next();//15
		
		String m = scan.next();//16
		String n = scan.next();//17
		String o = scan.next();//18
		String p = scan.next();//19
		String q = scan.next();//20
		String r = scan.next();//21
		
		String s = scan.next();//22
		char frTT = s.charAt(0);
		String t = scan.next();//23
		String u = scan.next();//24
		String v = scan.next();//25
		String w = scan.next();//26
		String x = scan.next();//27
		
		
		Double first = Double.parseDouble(a);
		Double second = Double.parseDouble(c);
		Double third = Double.parseDouble(d);
		Double fourth = Double.parseDouble(f);
		Double fifth = Double.parseDouble(g);
		Double sixth = Double.parseDouble(i);


Double seventh = Double.parseDouble(m);
Double eighth = Double.parseDouble(o);
Double ninth = Double.parseDouble(p);
Double tenth = Double.parseDouble(r);
Double totals = ((first * second) + (third * fourth) + (fifth * sixth));

Double totalst = ((seventh * eighth) + (ninth * tenth));

Double eleventh = Double.parseDouble(v);
Double twelth = Double.parseDouble(x);
Double totalstt = ((eleventh * twelth) );
scan.close();

System.out.println(totalCustomers );

System.out.println(fr + ". " + nextName+":" + " " + totals );
System.out.println(frT + ". " + k+":" + " " + totalst );

System.out.println(frTT + ". " + t+":" + " " + totalstt );

		
	}
}
