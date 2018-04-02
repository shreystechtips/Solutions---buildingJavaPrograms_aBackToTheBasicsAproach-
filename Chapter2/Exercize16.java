import java.util.*;
public class Exercize16 {
	public static void main (String[] args) {
		Scanner heights = new Scanner(System.in);
		System.out.println("Enter the height");
		int input = heights.nextInt(); 
		for (int i=1; i<=input;i++) {
			for (int j=1; j<=(i-1)*2;j++){
				System.out.print("\\");
			}
			for (int j=1; j<=(4*input-2)-((i-1)*4);j++){
				System.out.print("!");
			}
			for (int j=1; j<=(i-1)*2;j++){
				System.out.print("/");
			}
			System.out.println();
		}
	}
}
