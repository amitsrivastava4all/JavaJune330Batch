/*
Java OOP
Everything start with class
Class name must be start with Captial Letter
Class Name start with Alpha , can have alpha numeric
Special Char _ $
Can;t Start with Number
*/

class FirstClass{
	public static void main(){
		System.out.println("This is user define main ");
	}

	// public is a predefine keyword and it allow main to access outside the package
	// static - i will load the things when class is loaded
	// void - no return 
	// String - It is a predefine class, char [] 
	// String has predefine functions length, uppercase, replace
	// args - it is a variable and it can be anything
	// [] it is an array
	// String args[] - it is called command line argument
	static public  void main(String []arr){
	//int yy = 100/0;
	int sum =0;
	int number = 0;
	//for(int i = 0; i<arr.length; i++){
	for(String s : arr){
	try{
	number =  Integer.parseInt(s);  // throw NumberFormatException
	}
	catch(NumberFormatException b){
	System.out.println("Only Number Allowed , U Enter Something else, and i treat the Value as Zero ");
	number = 0;
	}
	sum = sum + number;
		//sum = sum + Integer.parseInt(arr[i]);
	}
	//main();
	// Local var has to initalize before use
	//int a=Integer.parseInt(arr[0]) ;  // 4 byte
	//int b=Integer.parseInt(arr[1]) ;
	//int c = a + b;
	
	// System - it is a predefine Java Class
	// out is an object of PrintStream class
	// println is a function of PrintStream class
	System.out.println("Sum is  "+sum);
	}
}