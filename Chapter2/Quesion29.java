
public class Quesion29 {
	public static void main (String[] args) {
		int i;
		int size =200000000;
				;
		for(i=1; i<=size;i++) {
			for(int t=1; t<=2*i-2;t++) {
				System.out.print("\\");
			}
			for(int p=1; p<=4*(size-i)+2;p++) {
			System.out.print("!");
			}
			for(int t=1; t<=2*i-2;t++) {
				System.out.print("/");
			}
			System.out.println();
		}
	}
}
