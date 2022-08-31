// Must watch --> https://www.youtube.com/shorts/AcxBRs8r2hQ
// Like, share and subscribe my channel

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int fact = 1;
		
		if(num == 0){
			System.out.println(num + "!" + " is " + fact);
		} else {
			for(int i = 1 ; i <= num ; i++){
				fact = fact * i;
			}
			System.out.println(num + "!" + " is " + fact);
		}
	}
}
