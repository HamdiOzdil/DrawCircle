import java.util.Scanner;

public class DrawCircle {
	
		public static void Circle(int x, int y, int r) {
		    for (int i = 0; i <= x + r; i++) {
		       for (int j = 0; j <= y + r; j++) {
		            int x2 = (i + x)*(i + x);
		            int y2 = (j + y)*(j + y);
		            if (Math.abs(x2 + y2 - r * r) < r) {
		                System.out.print("*");
		            } else {
		                System.out.print(" ");
		            }
		        }
		        System.out.println();
		    }
		}

		public static void main(String[] args){			
			Scanner scan = new Scanner(System.in);
			System.out.println("Radius: ");
			int r = scan.nextInt();
		    Circle(r,r+5,r);
		}
}
