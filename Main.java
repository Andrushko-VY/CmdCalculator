import java.util.Scanner;

 
public class Main {
	
	static String oper;
	static double numb1, numb2;
	
    static Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {
    	
    	do {
    	
    	System.out.println("Enter the first number and press <Enter>");
    	   	
     	while (! scanner.hasNextDouble() ) {
    		System.out.println("Please, enter double");
    		scanner.next();
      		
       	}
     	numb1 = scanner.nextDouble();
     	
    	System.out.println("Enter the operator (+, -, *, /) and press <Enter>");
    	
    	oper = scanner.next();
    	
    	while (! (oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) ) {
    		System.out.println("Please, enter the operator (+, -, *, /)");
    		oper = scanner.next();
    		
       	}
    	
    	System.out.println("Enter the second number and press <Enter>");
    	
     	while (! scanner.hasNextDouble() ) {
    		System.out.println("Please, enter double");
    		scanner.next();
      		
       	}
     	numb2 = scanner.nextDouble();
    	
    	
    	switch (oper) {
    	
    	case "+":
    		System.out.print("result = ");
    		System.out.println(numb1 + numb2);
    		break;
    	case "-":
    		System.out.print("result =");
    		System.out.println(numb1 - numb2);
    		break;
    	case "*":
    		System.out.print("result =");
    		System.out.println(numb1 * numb2);
    		break;
    	case "/":
    		System.out.print("result =");
    		if (numb2 == 0) {
    			System.out.println("infinity");
    		}
    		else {
    			System.out.println(numb1 / numb2);
    		}
    		break;
    	}
    	
    	System.out.println("to continue press <y>");
    	}
    	
    	while (scanner.next().equals("y"));
    	
    	scanner.close();
    	
    	System.exit(0);
    	
    }   
}
    	
    

    
