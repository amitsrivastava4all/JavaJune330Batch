class T{
	T(int x){
		
	}
}
class T2 extends T{
	T2(int p){
		super(p);
	}
}

class Person
{
	int age;
	String name;
	String nation;
	Person(){
		nation = "Indian";
		System.out.println("Person Default Cons");
	}
	Person(String name , int age){
		this();
		this.name = name;
		this.age = age;
		System.out.println("Person Param Cons Call");
	}
}
class ITStudent extends Person{
	int id;
	String course;
	String collegeName;
	
	ITStudent(String name, int age){
		//super();
		super(name,age);
		collegeName = "SRCC";
		System.out.println("Student Default Cons");
	}
	ITStudent(int id , String course, String name , int age){
		this(name,age);
		//super(name,age);
		this.id = id;
		this.course = course;
		System.out.println("Student Param cons call");
	}
	void print(){
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Course "+course);
		System.out.println("Age "+age);
		System.out.println("Nation "+nation);
		System.out.println("College Name "+collegeName);
	}
}
public class SuperVsThis {

	public static void main(String[] args) {
		ITStudent ram = new ITStudent(1001, "MCA","Ram",21);
		ram.print();
		T2 obj = new T2(100);
	}

}
