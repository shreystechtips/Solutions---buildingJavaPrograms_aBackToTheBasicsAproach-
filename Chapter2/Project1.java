import java.util.*;
public class Project1 {
	public static void main (String[] args) {
		int stars = 6;
		int h = stars;
		for(int i=1; i<=(h+1); i++) {
			for(int j=1; j<=stars; j++) {
				System.out.print("*");
			}
			System.out.print(" ");
			for(int j=1; j<=(i-1); j++) {
				System.out.print(" ");
			}
			System.out.print(" ");
			for(int k=1; k<=((h*2)-2*(i-1));k++) {
				System.out.print("/");
			}
			for(int l=1;l<=(2*(i-1));l++) {
				System.out.print("\\");
			}
			System.out.print(" ");
			for(int j=1; j<=(i-1); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=stars; j++) {
				System.out.print("*");
			}
			stars-=1;
			System.out.println();
		}
	}
}
