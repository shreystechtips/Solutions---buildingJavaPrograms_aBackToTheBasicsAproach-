
public class Project4 {
public static int people = 5;
public static int i;
	public static void main (String[] args) {
		for(i =1; i<=people;i++) {
		person();
		}
		for(int j=1; j<=(5*(people+1))+1;j++) {
			System.out.print("*");
		}
	}
	
	public static void person() {
		space();
		System.out.print(" o  ******");
		for (int j=1; j<=5*(i-1); j++) {
			System.out.print(" ");
	    }
		System.out.println("*");
		space();
		System.out.print("/|\\ *");
		stars();
		space();
		System.out.print(" |  *");
		stars();
		space();
		System.out.print("/ \\ *");
		stars();
		
	}
public static void stars() {
	for (int j=1; j<=5*(i); j++) {
		System.out.print(" ");
   }`
	System.out.println("*");
}
public static void space() {
	for(int j=1; j<=5*(people-i);j++) {
		System.out.print(" ");
	}
}
}
