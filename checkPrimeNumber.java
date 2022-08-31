import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		boolean check = false;
		
		for(int i = 2 ; i <= num / 2 ; i++){
			if(num % i == 0){
				check = true;
				break;
			}
		}
		
		if(num == 1){
			System.out.println("Niether prime nor composite");
		} else if(check){
			System.out.println(num + " is not a prime");
		} else {
			System.out.println(num + " is a prime");
		}
	}
}