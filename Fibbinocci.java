package week1.day2;

import java.util.Iterator;

public class Fibbinocci {

	public static void main(String[] args) {
		int a=0; int b=1; int c;
 
		System.out.println("*** Fibbinocci Series ***");
		
		System.out.println(a + "\n" + b);
		for (int i = 2; i <= 11; i++) {
			c= a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
