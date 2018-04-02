import java.util.Scanner;

/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr1, 2018
*/

/*
Your expected results after the input is provided:

 1. 34.5
 2. 6.0
 3. Will Throw Exception
 4. Will Throw Exception

 5. Will Throw Exception
 6. Will Throw Exception
 7. Will Throw Exception
 8. 645.0
  
 */

public class P1_TestInputExpressions {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); 
		System.out.print("How much money do you have? "); 
		double money = console.nextDouble(); 
		System.out.println(money);
		console.close();
	}

}
