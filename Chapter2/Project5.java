

public class Project5 {
	public static int constant = 4;
	public static void main (String[] args) {
		nose();
		lines();
		body1();
		body2();
		lines();
		body2();
		body1();
		lines();
		nose();
	}
	public static void nose() {
		for (int i=1; i<=(constant*2)-1;i++) {
			for (int j=1; j<=(constant*2)-i;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("/");
			}
			System.out.print("*");
			for(int j=1; j<=i;j++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}
	public static void lines() {
		System.out.print("+");
		for(int i=1; i<=constant*2;i++) {
			System.out.print("=*");
		}
		System.out.println("+");
	}
	public static void body1() {
		for(int i=1; i<=(constant);i++) {
			System.out.print("|");
			for (int j=1; j<=constant-i;j++) {
				System.out.print(".");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("/\\");
			}
			for(int j=1;j<=2*(constant-i);j++) {
				System.out.print(".");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("/\\");
			}
			for (int j=1; j<=constant-i;j++) {
				System.out.print(".");
			}
			System.out.println("|");
		}
	}
	public static void body2(){
	  for(int i=1; i<=(constant);i++) {
			System.out.print("|");
			for (int j=1;j<=i-1;j++) {
				System.out.print(".");
			}
			for(int j=1;j<=constant-(i-1);j++) {
				System.out.print("\\/");
			}
			for(int j=1;j<=2*(i-1);j++) {
				System.out.print(".");
			}
			for(int j=1;j<=constant-(i-1);j++) {
				System.out.print("\\/");
			}
			for (int j=1; j<=i-1;j++) {
				System.out.print(".");
			}
			System.out.println("|");
		}
	}
}
