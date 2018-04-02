import java.util.*;
public class Exercize8 {
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter a number: ");
		int l= reader.nextInt();;
		for (int i=1; i<=l;i++) {
			for (int j=1; j<=(l-i); j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
}
// Finished on page 125
