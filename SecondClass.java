/*
Java OOP
Everything start with class
Class name must be start with Captial Letter
Class Name start with Alpha , can have alpha numeric
Special Char _ $
Can;t Start with Number
*/

class FirstClass{
	// public is a predefine keyword and it allow main to access outside the package
	// static - i will load the things when class is loaded
	// void - no return 
	// String - It is a predefine class, char [] 
	// String has predefine functions length, uppercase, replace
	// args - it is a variable and it can be anything
	// [] it is an array
	// String args[] - it is called command line argument
	static public  void main(String []arr){
	// Local var has to initalize before use
	int a=Integer.parseInt(arr[0]) ;  // 4 byte
	int b=Integer.parseInt(arr[1]) ;
	int c = a + b;
	
	// System - it is a predefine Java Class
	// out is an object of PrintStream class
	// println is a function of PrintStream class
	System.out.println("Sum is  "+c);
	}
}