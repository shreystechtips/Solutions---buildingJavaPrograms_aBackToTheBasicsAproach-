import java.util.*;
public class Exercize12 {
	public static void main (String[] args) {
		Scanner numbers= new Scanner(System.in);
		System.out.println("Enter how high to go:");
		int number=numbers.nextInt();
		Scanner reps= new Scanner(System.in);
		System.out.println("Enter how many for each:");
		int rep = reps.nextInt();
		for (int k=1; k<=3;k++) {
		for (int i=0; i<=number;i++) {
			for (int j=1; j<=number-i;j++) {
				System.out.print(number-i);
			}
		}
		System.out.println();
		}
	}
}
