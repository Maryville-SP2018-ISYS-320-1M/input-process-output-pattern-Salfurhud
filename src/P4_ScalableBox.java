 import java.util.Scanner;
/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr1, 2018
*/

public class P4_ScalableBox {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in); 
		System.out.print("Input box Width? "); 
		int w = console.nextInt();
		
		System.out.print("Input box height? "); 
		int h = console.nextInt();
		console.close();
		drawBoxCap(w);
		drawBoxInsides(h, w);
		drawBoxCap(w);
	}
	
	public static void drawBoxCap(int w) {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= w - 2; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides(int h, int w) {
		for( int insideRowIndex = 1; insideRowIndex <= h - 2; insideRowIndex++ ) {
			drawBoxInsideLine(w);
		}
	}
	
	public static void drawBoxInsideLine( int h ) {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= h - 2; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}
}
