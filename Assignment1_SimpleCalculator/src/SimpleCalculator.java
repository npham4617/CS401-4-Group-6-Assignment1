import java.util.Scanner;

public class SimpleCalculator {
	
	public static boolean checkUserInput(String userIn) {
		// Make sure the input value being a string
		boolean flag = false;
		int index = 0;
		
		while (index < userIn.length()) {
			if (!(userIn.charAt(index) >= '0' && userIn.charAt(index) <='9')) {
				flag = true;	
			}
			index = index + 1;
		}
		return flag;
	}
	
	public static void myCalculator (int number1, int number2, int operation) {	
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
	    		System.out.println("Cannot divide by zero");
	    	}
	    	else {
	    		float resultDi = (float) number1 / number2;
	    		System.out.println("Result: " + number1 + " / " + number2 + " = " + String.format("%.2f", resultDi));
	    	}
	    }
	}
	
	public static void main (String[] arg) {
		System.out.println("Welcome to the Simple Calculator!");
		Scanner scanner = new Scanner(System.in);  		// Create a Scanner object
		String action, userIn;

		do {
		    System.out.print("\nEnter the first number: ");
	        userIn = scanner.nextLine();
	        
	        while (checkUserInput(userIn)) {
	        	System.out.print("Invalid input. Re-enter the first number (nonletter): ");
	        	userIn = scanner.nextLine();
	        }
		    
	        int number1 = Integer.parseInt(userIn);					// Read user input

		    System.out.print("Enter the second number: ");
		    userIn = scanner.nextLine();
		    
		    while (checkUserInput(userIn)) {
	        	System.out.print("Invalid input. Re-enter the second number (nonletter): ");
	        	userIn = scanner.nextLine();
	        }
		    
		    int number2 = Integer.parseInt(userIn);	 				// Read user input
		    
		    String myMultiLineText = """
		    		\nSelect an operation:
		    		1.  Addition
		    		2.  Subtraction
		    		3.  Multiplication
		    		4.  Division\n
	                """;
		    System.out.println(myMultiLineText);
		    System.out.print("Enter the operation number: " );
		    userIn = scanner.nextLine();
	        
	        while (checkUserInput(userIn) || Integer.parseInt(userIn) < 1 || Integer.parseInt(userIn) > 4) {
	        	System.out.print("Re-enter the operation number (1-4): ");
	        	userIn = scanner.nextLine();
	        }
	        	    		    
		    int operation = Integer.parseInt(userIn);	 			// Read user input
		    
		    myCalculator (number1, number2, operation);
		   
		    System.out.print("\nDo you want to perform another calculation? (yes/no): ");
		    action = scanner.nextLine(); 
		    
		    if (action.equals("no"))
		    	System.out.println("\nGoodbye!");
		} while (action.equals("yes"));
		scanner.close();
	}
	

}
