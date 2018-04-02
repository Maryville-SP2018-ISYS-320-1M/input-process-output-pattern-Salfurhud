import java.util.Scanner;

/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr1, 2018
*/

public class P3_EchoChamber {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in); 
		System.out.print("What is your phrase? "); 
		String phrase = console.nextLine();
		System.out.print("How many times should i repeat it? "); 
		
		int repeatTimes = console.nextInt();
		
		for(int x = 0; x< repeatTimes; x++) {
			System.out.println(phrase);
		}
		
		console.close();
	}

}
