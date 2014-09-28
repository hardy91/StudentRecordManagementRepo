

package applicationLogic;
import java.util.Scanner;



public class Student {
	String regNo;
	String name;
	String cls;
	double phy;
	double chem;
	double maths;
	Student next_node ;
	// below are the Getter and Setters to access
	// to the above variables
	Scanner user_input = new Scanner(System.in);
	Student(){
		System.out.println("enter regNo");
		regNo = user_input.next();
	
		System.out.println("enter name");
		name = user_input.next();
		
		System.out.println("enter cls");
		cls = user_input.next();
		
		System.out.println("enter phy");
		phy = user_input.nextDouble();
		
		System.out.println("enter chem");
		chem = user_input.nextDouble();
		
		System.out.println("enter maths");
		maths = user_input.nextDouble();
	}
}
	