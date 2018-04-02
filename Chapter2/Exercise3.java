
public class Exercise3 {
	public static void main (String[] args) {
		int a=1;
		int b=1;
		int c=0;
		int limit = 14;
		
		limit = limit - 2;
			
	        while(limit>0)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(c + "  ");
	            limit--;
	        }
		}

}

