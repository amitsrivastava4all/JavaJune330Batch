import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EmployeeSalaryReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale = null;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Press 1 for English");
		System.out.println("हिंदी के लिए 2 दबाएं");
		System.out.println("Presione 3 para Español");
		int choice = scanner.nextInt();
		if(choice == 1){
			locale = new Locale("en","US");
		}
		else
		if(choice == 2){	
			locale = new Locale("hi","IN");
		}
		else
		if(choice == 3)	{
			locale = new Locale("es","ES");
		}
		ResourceBundle rb = ResourceBundle.getBundle("messages",locale);
		
		
		
		System.out.println(rb.getString("enterid"));
		int id = scanner.nextInt();
		System.out.println(rb.getString("entername"));
		scanner.nextLine();
		String name = scanner.nextLine();
		String names[] = name.split(" ");
		String properName = "";
		for(String n : names){
		properName  += String.valueOf(n.charAt(0)).toUpperCase()
				+ n.substring(1).toLowerCase()+" ";
		}
		/*char e = name.charAt(0);
		String temp = String.valueOf(e);
		temp = temp.toUpperCase();
		temp = temp + name.substring(1).toLowerCase();*/
		System.out.println(properName);
		System.out.println(rb.getString("entersalary"));
		double salary = scanner.nextDouble();
		//System.out.println("Salary is "+salary);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formattedSalary = nf.format(salary);
		System.out.println(formattedSalary);
		Date date = new Date();
		//System.out.println(date);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);
		String formattedDate = df.format(date);
		System.out.println(formattedDate);
		
	}

}
