import java.util.*;
public class Project2 {
	public static int width = 6;
	public static void main (String[] args) {
		lines();
		body1();
		lines();
		body2();
		lines();
		}
	public static void lines() {
		System.out.print("+");
		for(int j=1; j<=width;j++) {
			System.out.print("-");
		}
		System.out.print("+");
		System.out.println();
	}
	public static void body1() {
		int f= 1;
		for (int p=1; p<=width/3; p++) {
		for (int j=1; j<= (3); j++) {
			System.out.print("|");
			for (int i=1; i<=((width-2)/2)-(j-1);i++) {
				System.out.print(" ");
			}
			System.out.print("^");
			for (int i=1; i<= (2*(f-1));i++) {
				System.out.print(" ");
			}
			System.out.print("^");
			for (int i=1; i<=((width-2)/2)-(j-1);i++) {
				System.out.print(" ");
			}
			System.out.println("|");
			f++;
		}
		f =1;
		}
	}
	public static void body2() {
		int f= 1;
		for (int p=1; p<=width/3; p++) {
		for (int j=1; j<= (3); j++) {
			System.out.print("|");
			for (int i=1; i<=(j-1);i++) {
				System.out.print(" ");
			}
			System.out.print("v");
			for (int i=1; i<= 4-(2*(f-1));i++) {
				System.out.print(" ");
			}
			System.out.print("v");
			for (int i=1; i<=(j-1);i++) {
				System.out.print(" ");
			}
			System.out.println("|");
			f++;
		}
		f =1;
		}
	}
}
