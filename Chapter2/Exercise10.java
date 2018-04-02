import java.util.*;
public class Exercise10 {
	public static void main (String[] args) {
		Scanner rep = new Scanner(System.in);  
		System.out.println("Enter reps: ");
		int reps = rep.nextInt();
		Scanner counts = new Scanner(System.in);  
		System.out.println("Enter highgest number: ");
		int count = counts.nextInt();
		int length = (reps*count);
		int height = 2;
		int i,j;
		for (i=1; i<= height/2;i++) {
			for (int k=1; k<=length/count;k++) {
				for (j=1;j<=count; j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			}
			System.out.println();
				for (int l=1; l<=reps;l++) {
					for (int f=1; f<=count;f++) {
						System.out.print(f%10);
					}
					System.out.print("0");
				}
		}
	}
}
