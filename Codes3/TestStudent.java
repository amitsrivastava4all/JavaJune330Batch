
public class TestStudent {
// main is for execution 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Student.id);
		//System.out.println(Student.name);
		int marks[] = {100,90,89};
		Student mike = new Student("mike",marks) ;
		
		//mike.register(1001, "Mike", marks);
//		mike.id = -101;
//		mike.name="Mike";
//		mike.marks[0] = -100;
//		mike.marks[1] = -90;
//		mike.marks[2] = 89;
		String result= mike.printInfo("\n");
		System.out.println(result);
//		System.out.println(mike.id);
//		System.out.println(mike.name);
//		for(int i = 0; i<mike.marks.length; i++){
//			System.out.println(mike.marks[i]);
//		}
		System.out.println("***********************");
		int marks2[]={90,89,78};
		Student tim  = new Student("tim",marks2);
		result = tim.printInfo("\n");
		System.out.println(result);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
		 result= mike.printInfo("\n");
			System.out.println(result);
//		System.out.println(tim.id);
//		System.out.println(tim.name);
//		for(int i = 0; i<tim.marks.length; i++){
//			System.out.println(tim.marks[i]);
//		}
		//int x = 100;

	}

}
