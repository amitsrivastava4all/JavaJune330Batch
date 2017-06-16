// Encapsulation 
// POJO
public class Student {
	private static int counter=1000;
	private  int id;  // Member Variables
	private  String name;
	private int marks[] = new int[3];
	private String collegeName ;
	public Student(){
		collegeName = "SRCC";
		System.out.println("Default Call");
		counter++;
		id = counter;
		
	}
//	Student(int id ){
//		this();
//		System.out.println("Single Param Call");
//		this.id = id + collegeName.length();
//	}
	public Student( String name, int marks[]){
		this();
		//this(id);
		System.out.println("Multi Param Call");
		this.name = name;
		this.marks = marks;
		
	}
	public void register(int id, String name, int marks[]){  // Local Variables
		this.id = id;  // Assign Local Variables Value into Member Variable
		this.name = name;
		this.marks = marks;
	}
	
	public String printInfo(String delimeter){
		String result = "College Name "+collegeName+delimeter+"Id "+id+delimeter+" Name "+name+delimeter+"Marks ";
		String markResult = "";
		for(int mark: marks){
			markResult += mark +delimeter;
		}
		String result2 = "Total Marks "+totalMarks()+delimeter+"Percentage "+percentage()+delimeter
				+"Grade "+grade() + delimeter;
		return result + markResult + result2;
				
//		System.out.println("Id "+this.id);
//		System.out.println("Name "+name);
//		System.out.println("Marks is ");
//		for(int i = 0; i<marks.length; i++){
//			System.out.println(marks[i]);
//		}
//		System.out.println("Total marks "+totalMarks());
//		System.out.println("Percentage "+percentage());
//		System.out.println("Grade "+grade());
	}
	
	public int totalMarks(){
		// Enhance for loop (java 1.5)
		int sum = 0;
		for(int i : marks){
			sum = sum + i;
		}
		return sum;
	}
	
	public double percentage(){
		return totalMarks()/marks.length;
	}
	
	public String grade(){
		return percentage()>90?"A Grade ":"B Grade";
	}
}
