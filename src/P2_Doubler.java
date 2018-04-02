import java.util.Scanner;

/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr1, 2018
*/

public class P2_Doubler {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in); 
		System.out.print("What is your number? "); 
		int number = console.nextInt();
		System.out.println("That number doubles is " + (number * 2) + ".");
		console.close();
	}

}
