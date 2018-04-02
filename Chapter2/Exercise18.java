
public class Exercise18 {
	public static int scale=1, in=scale*2, input=in-1;
	public static void main (String[] args) {
	//	for (int i=1;i<=input/4;i++) {
			top();
			System.out.println();
			middle();
			top();
			System.out.println();
			middle();
			top();
	//	}
	}
	public static void top() {
		System.out.print("+");
		for(int j=1;j<=scale;j++) {
			System.out.print("===");
		}
		System.out.print("+");
		for(int j=1;j<=scale;j++) {
			System.out.print("===");
		}
		System.out.print("+");
	}
	public static void middle() {
		for(int i=1;i<=scale*3;i++) {
		System.out.print("|");
		for(int j=1;j<=3*scale;j++) {
			System.out.print(" ");
		}
		System.out.print("|");
		for(int j=1;j<=3*scale;j++) {
			System.out.print(" ");
		}
		System.out.print("|");
		System.out.println();
		}
	}
}
