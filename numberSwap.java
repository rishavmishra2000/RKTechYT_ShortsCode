// Must Watch --> https://www.youtube.com/shorts/ZmBw01CY7Z8
// Like, share and susbcribe my channel

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, temp;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Before swap: " + a + " ," + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap: " + a + " ," + b);
	}
}
