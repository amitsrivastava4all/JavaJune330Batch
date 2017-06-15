// S O L I D
// S - SRP 
// D - DRY
/*
 * Encapsulation  = Binding Member Variables + Member Methods into a single unit
 * e.g class
 * Gud Encapsulation - private member variables and public methods
 */
public class Employee {
	 private int id; // Member Variables
	 private String name;
	 private double salary;
	 
	 // Member Methods
	 public void takeInput(int id , String name, double salary){
		 if(id>0 && salary>0){
		 this.id = id;  // Member Variable = local variable
		 this.name = name;
		 this.salary = salary;
		 }
		 else
		 {
			 System.out.println("Invalid Id or Salary");
		 }
	 }
	 
//	 public int hashCode(){
//		 return 2;
//	 }
	 public void print(){
		 System.out.println(this.id);
			System.out.println(name);
			System.out.println(salary);
	 }
}
