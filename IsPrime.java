package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int num = 71;
		boolean isPrime = true;
		 for (int i = 2; i < num-1 ; i++) 
		 {
			 System.out.println(i + " " + num%i);
			if (num% i ==0)
			{
//				System.out.println(i);
				isPrime = false;
				break;
			}
		 }
		 if (isPrime)
		 System.out.println(num + " is a Prime number");
		 else 
			 System.out.println(num + " is not a Primer number");
	}

}
