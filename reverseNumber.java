// Must watch --> https://www.youtube.com/shorts/v6RH_W7RBXE
// Like, share and subscribe my channel

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, revNum = 0;
		num = sc.nextInt();
		
		System.out.println("Original Number: " + num);
		
		while(num != 0){
			int temp = num % 10;
			revNum = revNum * 10 + temp;
			num = num / 10;
		}
		
		System.out.println("Reverse Number: " + revNum);
	}
}
