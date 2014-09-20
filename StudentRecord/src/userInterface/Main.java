package userInterface;
import java.util.LinkedList;
import applicationLogic.Student;
public class Main {
	// one list that shall be used throughout the application
	public LinkedList<Student> studentRecord = new LinkedList<Student>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface ui = new UserInterface();
		ui.interactWithUser();
	}
}