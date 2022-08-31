// Must Watch --> https://www.youtube.com/shorts/LyK_OXgrSOc
// Like, share and subscribe my channel

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("Quotient= " + quotient);
		System.out.println("Remainder= " + remainder);
		
	}
}
