import java.util.Scanner;

public class SimpleCalculator {
	
	static void myCalculator (int number1, int number2, int operation) {
		int result;
	    if (operation == 1) {
	    	result = number1 + number2;
	    	System.out.println("Result: " + number1 + " + " + number2 + " = " + result);
	    }
	    if (operation == 2) {
	    	result = number1 - number2;
	    	System.out.println("Result: " + number1 + " - " + number2 + " = " + result);
	    }
	    if (operation == 3) {
	    	result = number1 * number2;
	    	System.out.println("Result: " + number1 + " * " + number2 + " = " + result);
	    }
	    if (operation == 4) {
	    	if (number2 == 0) {
	    		result = 0;
	    	}
	    	else {
	    		result = number1 / number2;
	    	}
	    	System.out.println("Result: " + number1 + " / " + number2 + " = " + result);
	    }
	}
	
	public static void main (String[] arg) {
		System.out.println("Welcome to the Simple Calculator!");
		String action;
		do {
			Scanner userIn = new Scanner(System.in);  		// Create a Scanner object
		    System.out.print("\nEnter the first number: ");
	        int number1 = userIn.nextInt();					// Read user input
	        
		    System.out.print("Enter the second number: ");
		    int number2 = userIn.nextInt();	 				// Read user input
		    
		    String myMultiLineText = """
		    		\nSelect an operation:
		    		1.  Addition
		    		2.  Subtraction
		    		3.  Multiplication
		    		4.  Division\n
	                """;
		    System.out.println(myMultiLineText);
		    System.out.print("Enter the operation number: " );
		    int operation = userIn.nextInt();	 			// Read user input
		    myCalculator (number1, number2, operation);
		   
		    Scanner userOp = new Scanner(System.in); 
		    System.out.print("\nDo you want to perform another calculation? (yes/no): ");
		    action = userOp.nextLine(); 
		    
		    if (action.equals("no"))
		    	System.out.println("\nGoodbye!");
		} while (action.equals("yes"));
	}

}
