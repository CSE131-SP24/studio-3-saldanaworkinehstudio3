package studio3;

import java.util.Scanner; 

public class Sieve {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int n = in.nextInt(); 
	
	int[] inputSize = new int[n]; 
	
	if (n%2 >= 0); 
	{
		n = in.nextInt(); 
		System.out.print(true);
		
	}
	while (n%2 > 0); 
	{ 
		System.out.print(false);

	}

}
}
