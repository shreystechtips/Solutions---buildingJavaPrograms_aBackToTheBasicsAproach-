
public class Exercise9 {
	public static final int length=40, lines=4;
	public static void main (String[] args) {
		int j;
		for (int i =1; i<=lines/4;i++) {
		lines();	
			System.out.println();
		for (j=1;j<=(length/4);j++) {
				System.out.print("_-^-");
			}
		System.out.println();
		for (j=1; j<=length/2;j++) {
			System.out.print(j%10);
			System.out.print(j%10);
		}
		}
		System.out.println();
		lines();
		
		}
	public static void lines() {
		for (int j=1; j<=length;j++) {
			System.out.print("-");
		}
	}
}
