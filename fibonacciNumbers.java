import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int printCount = sc.nextInt();
		int a = 0, b = 1, temp;
		
		for(int i = 0; i <= printCount - 1; i++){
			System.out.print(a + " ");
			
			temp = a + b;
			a = b;
			b = temp;
		}
	}
}