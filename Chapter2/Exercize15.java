import java.util.*;
public class Exercize15 {
	public static void main (String[] args) {
		Scanner highs = new Scanner(System.in);
		System.out.println("How high do you want to go?");
		int high = highs.nextInt();
		for (int i=1; i<=high; i++) {
			for (int j=1; j<=((high+2-i)/2);j++) {
				System.out.print("-");
			}
			for (int j=1;j<=i;j++) {
			System.out.print(i%10
					);
			}
			for (int j=1; j<=((high+2-i)/2)
					;j++) {
				System.out.print("-");
			}
			System.out.println();
			i++;
		}
		}
		
	}

