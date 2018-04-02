import java.util.*;
public class Project3 {
	public static int width = 11;
	public static int height = 8;
	public static void main (String[] args) {
		top();
		middle();
		top();
		bottom();
		top();
	}
	public static void top() {
		System.out.print("+");
		for(int i=1; i<= width-2; i++ ) {
			System.out.print("-");
		}System.out.println("+");
	}
	public static void middle() {
		int l=0;
		int p;
		for (p=1; p<=height/2;p++) {
			System.out.print("|");
			for(int j=1; j<=(-p+5);j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=p-1;j++) {
				System.out.print("/");
			}
			System.out.print("*");
			for(int j=1; j<=p-1;j++) {
				System.out.print("\\");
			}
			for(int j=1; j<=(-p+5);j++) {
				System.out.print(" ");
		}
			System.out.println("|");
		}
		for (p=1; p<=height/2;p++) {
			System.out.print("|");
			for(int j=1; j<=(p);j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=-p+4;j++) {
				System.out.print("\\");
			}
			System.out.print("*");
			for(int j=1; j<=-p+4;j++) {
				System.out.print("/");
			}
			for(int j=1; j<=(p);j++) {
				System.out.print(" ");
		}
			System.out.println("|");
		}
		
	}
	public static void bottom() {
		int p;
		for (p=1; p<=height/2;p++) {
			System.out.print("|");
			for(int j=1; j<=(p);j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=-p+4;j++) {
				System.out.print("\\");
			}
			System.out.print("*");
			for(int j=1; j<=-p+4;j++) {
				System.out.print("/");
			}
			for(int j=1; j<=(p);j++) {
				System.out.print(" ");
		}
			System.out.println("|");
		}
		for (p=1; p<=height/2;p++) {
			System.out.print("|");
			for(int j=1; j<=(-p+5);j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=p-1;j++) {
				System.out.print("/");
			}
			System.out.print("*");
			for(int j=1; j<=p-1;j++) {
				System.out.print("\\");
			}
			for(int j=1; j<=(-p+5);j++) {
				System.out.print(" ");
		}
			System.out.println("|");
		}
	}
}
